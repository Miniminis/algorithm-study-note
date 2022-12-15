package practice.algorithm.math;

import java.util.Scanner;

public class Bj1978_1 {

    public static boolean[] isPrime = new boolean[1001];

    public static void main(String[] args) {

        isPrime();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        while(n > 0) {
            if (!isPrime[sc.nextInt()]) {
                count++;
            }
            n--;
        }

        System.out.println(count);
    }

    private static void isPrime() {
        //true : 소수 아님, false : 소수임
        isPrime[0] = isPrime[1] = true;

        for (int i = 0; i < Math.sqrt(isPrime.length); i++) {
            if (!isPrime[i]) {
                for (int j = i*i; j < isPrime.length; j += i) {
                    isPrime[j] = true;
                }
            }
        }
    }


}
