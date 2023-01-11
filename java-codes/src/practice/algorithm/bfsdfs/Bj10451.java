package practice.algorithm.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/10451
 * 순열 사이클
 * 313280 kb / 2012 ms
 * */
public class Bj10451 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        //case t 만큼 순회
        while (t > 0) {
            t--;

            //순열의 크기 n
            int n = Integer.parseInt(br.readLine());
            int [][] graph = new int[n+1][n+1];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                int j = Integer.parseInt(st.nextToken());
                graph[i][j] = graph[j][i] = 1;
            }

            boolean[] visited = new boolean[n+1];
            Arrays.fill(visited, false);
            visited[0] = true;

            int count = 0;
            while (true) {
                int node = getNotVisited(visited);
                if (node < 0) {
                    break;
                }

                bfs(graph, visited, node);
                count++;
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }

    private static int getNotVisited(boolean[] visited) {
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                return i;
            }
        }
        return -1;
    }

    private static void bfs(int[][] graph, boolean[] visited, int i) {
        visited[i] = true;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(i);

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int j = 0; j < graph[node].length; j++) {
                if (graph[node][j] == 1 && !visited[j]) {
                    visited[j] = true;
                    queue.add(j);
                }
            }
        }
    }

}

/**
 * 접근방식
 * bfs 로 순회하면, 연결된 노드는 모두 방문하게 된다.
 * 그 순회를 총 몇 번하는지 카운트하면 될 것 같다.
 * */
