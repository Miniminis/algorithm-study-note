package practice.algorithm.recursion;

/**
 * 미로찾기
 * */
public class Maze {
    private static final int N = 8;
    private static int[][] maze = {
            {0, 0, 0, 0, 0, 0, 0, 1},
            {0, 1, 1, 0, 1, 1, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 1},
            {0, 1, 0, 0, 1, 1, 0, 1},
            {0, 1, 1, 1, 0, 0, 1, 1},
            {0, 1, 0, 0, 0, 1, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 1},
            {0, 1, 1, 1, 0, 1, 0, 0},
    };

    private static final int PATHWAY_COLOR = 0;
    private static final int WALL_COLOR = 1;
    private static final int BLOCKED_COLOR = 2;
    private static final int PATH_COLOR = 3;

    public static void main(String[] args) {
        printMaze();
        findMaze(0, 0);
        printMaze();
    }

    private static boolean findMaze(int x, int y) {
        if (x < 0 || y < 0 || x >= N || y >= N) {
            return false;
        }

        if (maze[x][y] != PATHWAY_COLOR) {
            return false;
        }

        if (x == N-1 && y == N-1) {
            maze[x][y] = PATH_COLOR;
            return true;
        }

        maze[x][y] = PATH_COLOR;
        if (findMaze(x, y-1) || findMaze(x, y+1)
                || findMaze(x-1, y) || findMaze(x+1, y)) {
            return true;
        }

        maze[x][y] = BLOCKED_COLOR;
        return false;
    }

    private static void printMaze() {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * 00000001
     * 01101101
     * 00010001
     * 01001101
     * 01110011
     * 01000101
     * 00010001
     * 01110100
     *
     * 32222221
     * 31121121
     * 32212221
     * 31221121
     * 31112211
     * 31333121
     * 33313331
     * 01110133
     * */

}
