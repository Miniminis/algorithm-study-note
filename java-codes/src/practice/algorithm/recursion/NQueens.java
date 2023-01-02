package practice.algorithm.recursion;

/**
 * N Queens
 * */
public class NQueens {
    private static final int N = 4;
    private static final int[] cols = new int[N+1];    //놓인 말의 위치 행과 열 cols[i] = j

    public static void main(String[] args) {
        queens(0);
    }

    private static boolean queens(int level) {
        if (!isPromising(level)) {
            return false;
        }

        if (level == N) {
            for (int i = 1; i <= N; i++) {
                System.out.println("(" +  i + ", " + cols[i] + ")");
            }
            return true;
        }

        for (int i = 1; i <= N; i++) {
            cols[level + 1] = i;
            if (queens(level+1)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isPromising(int level) {
        for (int i = 1; i < level; i++) {
            if (cols[i] == cols[level]) {
                return false;
            }

            if (level - i == Math.abs(cols[i] - cols[level])) {
                return false;
            }
        }
        return true;
    }

    /**
     * (1, 2)
     * (2, 4)
     * (3, 1)
     * (4, 3)
     * */

}
