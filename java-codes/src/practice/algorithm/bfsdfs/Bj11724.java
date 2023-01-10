package practice.algorithm.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/11724
 * 연결 요소의 개수
 * 116896 kb / 524 ms
 * */
public class Bj11724 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

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

        System.out.println(count);
    }

    private static int getNotVisited(boolean[] visited) {
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                return i;
            }
        }
        return -1;
    }

    private static void bfs(int[][] graph, boolean[] visited, int v) {
        visited[v] = true;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);

        while(!queue.isEmpty()) {
            int node = queue.poll();

            for (int i = 0; i < graph.length; i++) {
                if (graph[node][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}

/**
 * 접근방식
 * 방향없는 그래프가 주어졌을 때, 연결 요소의 개수를 구하는 프로그램
 * = 연결된 덩어리가 몇개인지 구하라
 *
 * 1. 입력된 노드의 개수 n 만큼 n*n 인접행렬을 만든다.
 * 2. 각 연결 정보가 주어질 때마다, graph[a][b] = graph[b][a] = 1 로 연결 표시
 * 3. 각 노드별로 visited[] 을 통해서 접근 여부를 점검
 * 4. 노드가 서로 연결되어있지 않은 경우도 존재하므로, 모든 노드가 visited 될 때까지 반복한다.
 * 5. 매 반복마다 bfs 를 수행한다. -> 한번 루프 돌 때 : 연결된 모든 노드는 방문처리됨
 * 6. 반복 횟수 = 덩어리의 개수 = 연결 요소의 개수
 * */
