package practice.algorithm.bfsdfs;

import java.util.Arrays;

public class Dfs {

    public static void main(String[] args) {
        int[][] graph = new int[][]{
                {},
                {2, 3, 8},
                {1, 7},
                {1, 4, 5},
                {3, 5},
                {3, 4},
                {7},
                {2, 6, 8},
                {1, 7}
        };

        boolean[] visited = new boolean[9];
        Arrays.fill(visited, false);

        dfs(graph, 1, visited);
    }

    public static void dfs(int[][] graph, int i, boolean[] visied) {
        visied[i] = true;
        System.out.println("i = " + i);

        for (int node : graph[i]) {
            if (!visied[node]) {
                dfs(graph, node, visied);
            }
        }
    }
}
