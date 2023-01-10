package practice.algorithm.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1260
 * DFS와 BFS
 * 24056 kb / 308 ms
 * */
public class Bj1260 {

    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int[][] graph = new int[n+1][n+1];
        while (m > 0) {
            m--;

            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a][b] = graph[b][a] = 1;
        }

        boolean[] visited = new boolean[n+1];
        Arrays.fill(visited, false);

        dfs(graph, visited, s);
        sb.append("\n");

        Arrays.fill(visited, false);
        bfs(graph, visited, s);

        System.out.println(sb);
    }


    private static void dfs(int[][] graph, boolean[] visited, int s) {
        visited[s] = true;
        sb.append(s + " ");

        for (int i = 1; i < graph[s].length; i++) {
            if (graph[s][i] == 1 && !visited[i]) {
                dfs(graph, visited, i);
            }
        }
    }

    private static void bfs(int[][] graph, boolean[] visited, int s) {
        visited[s] = true;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);

        while(!queue.isEmpty()) {
            int node = queue.poll();
            sb.append(node + " ");

            for (int i = 1; i < graph[node].length; i++) {
                if (graph[node][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                 }
            }
        }
    }

}
