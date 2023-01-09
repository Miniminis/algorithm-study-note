package practice.algorithm.bfsdfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * bfs
 * 1 2 3 8 7 4 5 6
 * */
public class Bfs {
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

        bfs(graph, visited, 1);
    }

    private static void bfs(int[][] graph, boolean[] visited, int i) {
        visited[i] = true;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(i);

        while (!queue.isEmpty()) {
            Integer v = queue.poll();
            System.out.print(v + " ");

            for (int node : graph[v]) {
                if (!visited[node]) {
                    visited[node] = true;
                    queue.add(node);
                }
            }
        }
    }

}
