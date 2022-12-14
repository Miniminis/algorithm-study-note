package practice.algorithm.math;

import java.util.Scanner;

public class Bj4948_2 {

    private static final int MAX_NUM = 123457;
    private static boolean[] isPrime = new boolean[MAX_NUM*2 + 1];
    private static int[] primeCount = new int[MAX_NUM*2 + 1];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        getPrime();
        getCount();
        StringBuilder sb = new StringBuilder();

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n == 0) break;

            sb.append(primeCount[2 * n] - primeCount[n]).append("\n");
        }

        System.out.println(sb);
    }

    private static void getCount() {
        int count = 0;
        for (int i = 2; i < isPrime.length; i++) {
            if (!isPrime[i]) {
                count++;
            }
            primeCount[i] = count;
        }
    }

    private static void getPrime() {
        //true : 소수 아님, false: 소수임
        isPrime[0] = isPrime[1] = true;

        for (int i = 2; i <= Math.sqrt(isPrime.length); i++) {
            if (!isPrime[i]) {
                for (int j = i*i; j < isPrime.length; j += i) {
                    isPrime[j] = true;
                }
            }
        }
    }
}
