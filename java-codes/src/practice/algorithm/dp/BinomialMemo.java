package practice.algorithm.dp;

import java.util.Arrays;

public class BinomialMemo {
    private static int[][] cache;

    public static void main(String[] args) {
        int n = 6;
        int k = 3;
        cache = new int[n+1][k+1];
        initialize();

        System.out.println(bionomial(n, k));
    }

    private static void initialize() {
        for (int i = 0; i < cache.length; i++) {
            Arrays.fill(cache[i], -1);
        }
    }

    private static int bionomial(int n, int k) {
        if (n == k || k == 0) {
            return 1;
        }

        if (cache[n][k] > -1) {
            return cache[n][k];
        }

        cache[n][k] = bionomial(n-1, k-1) + bionomial(n-1, k);
        return cache[n][k];
    }
}
