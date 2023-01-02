package practice.algorithm.dp;

import java.util.Arrays;

public class MinimumSumPathMemo {
    private static final int[][] m = {
            {0, 0, 0, 0, 0},
            {0, 6, 7, 12, 5},
            {0, 5, 3, 11, 18},
            {0, 7, 17, 3, 3},
            {0, 8, 10, 14, 9}
    };

    private static final int[][] l = new int[m.length][m.length];

    public static void main(String[] args) {
        initializeArrayL();
        System.out.println(findMinimumPath(4, 4));
    }

    private static void initializeArrayL() {
        for (int i = 0; i < l.length; i++) {
            Arrays.fill(l[i], -1);
        }
    }

    private static int findMinimumPath(int i, int j) {
        if (l[i][j] != -1) {
            return l[i][j];
        }

        if (i == 1 && j == 1) {
            l[i][j] = m[i][j];
        } else if (i == 1) {
            l[i][j] = findMinimumPath(1, j-1) + m[i][j];
        } else if (j == 1) {
            l[i][j] = findMinimumPath(i-1, 1) + m[i][j];
        } else {
            l[i][j] = Math.min(findMinimumPath(i-1, j), findMinimumPath(i, j-1)) + m[i][j];
        }

        return l[i][j];
    }

}
