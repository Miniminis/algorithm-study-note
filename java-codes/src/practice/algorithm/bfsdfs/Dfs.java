package practice.algorithm.bfsdfs;

import java.util.Arrays;

/**
 * dfs
 * 1 2 7 6 8 3 4 5
 * */
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

        dfs(graph, visited, 1);
    }

    private static void dfs(int[][] graph, boolean[] visited, int i) {
        visited[i] = true;
        System.out.print(i + " ");

        for (int node : graph[i]) {
            if (!visited[node]) {
                dfs(graph, visited, node);
            }
        }
    }

}
