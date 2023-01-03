package practice.algorithm.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/1003
 * 14056 kb / 124 ms
 * 피보나치 함수
 * - 구해야하는 것 : f(0), f(1) 이 호출되는 각각 횟수
 * */
public class Bj1003 {

    private static int[] zero;
    private static int[] one;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t != 0) {
            int n = Integer.parseInt(br.readLine());
            zero = new int[n+1];
            one = new int[n+1];

            fib(n);
            sb.append(zero[n]).append(" ").append(one[n]).append("\n");

            t--;
            Arrays.fill(zero, 0);
            Arrays.fill(one, 0);
        }

        System.out.println(sb);
    }

    private static void fib(int n) {
        zero[0] = 1;
        if (n == 0) return;

        one[1] = 1;
        if (n == 1) return;

        for (int i = 2; i <= n; i++) {
            zero[i] = zero[i-1] + zero[i-2];
            one[i] = one[i-1] + one[i-2];
        }
    }

    /**n - v    = (0 1)
     * 0 - 0    = 1 0
     * 1 - 1    = 0 1
     * 2 - 0+1  = 1 1
     * 3 = 2 + 1 = 0+1 + 1 = 1 2
     * 4 = 3+2 = 1 2 + 1 1 = 2 3
     * 1, 0
     * 0, 1
     * 1, 1
     * 1, 2
     * 2, 3
     * 3, 5
     * 5, 8
     * 8, 13
     * 13, 21
     * f(n) 까지의 0과 1의 호출 횟수 = f(n-1)까지의 횟수 + f(n-2)까지의 횟수
     * */
}
