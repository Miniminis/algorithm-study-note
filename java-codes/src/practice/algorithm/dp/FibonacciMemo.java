package practice.algorithm.dp;

import java.util.Arrays;

public class FibonacciMemo {

    private static int[] cache;

    public static void main(String[] args) {
        int n = 7;
        cache = new int[n+1];
        Arrays.fill(cache, -1);

        System.out.println(fib(n));
    }

    private static int fib(int n) {
        if (n <=2 ) {
            cache[n] = 1;
            return 1;
        }

        if (cache[n] > -1) {
            return cache[n];
        }

        cache[n] = fib(n-1) + fib(n-2);
        return cache[n];
    }

}
