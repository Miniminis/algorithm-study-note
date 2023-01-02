package practice.algorithm.dp;

public class MinimumSumPathBottomUp {
    private static final int N = 4;

    private static final int[][] m = {
            {0, 0, 0, 0, 0},
            {0, 6, 7, 12, 5},
            {0, 5, 3, 11, 18},
            {0, 7, 17, 3, 3},
            {0, 8, 10, 14, 9}
    };

    private static final int[][] l = new int[N+1][N+1];

    public static void main(String[] args) {
        System.out.println(findMinimumPath());
    }

    private static int findMinimumPath() {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {

                if (i == 1 && j == 1) {
                    l[i][j] = m[i][j];
                } else if (i == 1){
                    l[i][j] = m[1][j-1] + m[i][j];
                } else if (j == 1) {
                    l[i][j] = m[i-1][j] + m[i][j];
                } else {
                    l[i][j] = Math.min(l[i-1][j], l[i][j-1]) + m[i][j];
                }

            }
        }

        return l[N][N];
    }

}
