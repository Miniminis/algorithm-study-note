package practice.algorithm.dp;

public class MinimumSumPath {
    private static final int[][] m = {
            {0, 0, 0, 0, 0},
            {0, 6, 7, 12, 5},
            {0, 5, 3, 11, 18},
            {0, 7, 17, 3, 3},
            {0, 8, 10, 14, 9}
    };

    public static void main(String[] args) {
        System.out.println(findMinimumPath(4, 4));
    }

    private static int findMinimumPath(int i, int j) {
        if (i == 1 && j == 1) {
            return m[i][j];
        }

        if (i == 1) {
            return findMinimumPath(1, j-1) + m[i][j];
        }

        if (j == 1) {
            return findMinimumPath(i-1, 1) + m[i][j];
        }

        return Math.min(findMinimumPath(i-1, j), findMinimumPath(i, j-1)) + m[i][j];
    }
}
