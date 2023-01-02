package practice.algorithm.dp;

import java.util.Arrays;

public class FibonacciBottomUp {

    private static int[] f;

    public static void main(String[] args) {
        int n = 7;
        f = new int[n+1];

        System.out.println(fib(n));
    }

    private static int fib(int n) {
        f[1] = f[2] = 1;

        for (int i = 3; i <= n; i++) {
            f[i] = f[i-1] + f[i-2];
        }

        return f[n];
    }

}
