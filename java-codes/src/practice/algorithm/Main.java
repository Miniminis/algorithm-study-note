package practice.algorithm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

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

        bfs(graph, 1, visited);
    }

    private static void bfs(int[][] graph, int i, boolean[] visited) {
        visited[i] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(i);

        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.println("v = " + v);

            for (int node : graph[v]) {
                if (!visited[node]) {
                    queue.add(node);
                    visited[node] = true;
                }
            }
        }
    }
}
