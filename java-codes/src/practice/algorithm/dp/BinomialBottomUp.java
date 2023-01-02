package practice.algorithm.dp;

public class BinomialBottomUp {
    private static int[][] binom;

    public static void main(String[] args) {
        int n = 6;
        int k = 3;
        binom = new int[n+1][k+1];

        System.out.println(bionomial(n, k));
    }

    private static int bionomial(int n, int k) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= k && j <= i; j++) {
                if (i == j || j == 0) {
                    binom[i][j] = 1;
                    continue;
                }

                binom[i][j] = binom[i-1][j-1] + binom[i-1][j];
            }
        }
        return binom[n][k];
    }
}
