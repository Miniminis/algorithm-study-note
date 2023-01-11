package practice.algorithm.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/2606
 * 바이러스
 * 14288 kb / 124 ms
 * 접근방식
 * - 서로 연결된 컴퓨터들은 같이 웜 바이러스에 걸리게 된다
 * - 바이러스에 걸리는 1번 컴퓨터와 연결된 노드들의 개수를 출력한다.
 * - bfs 를 돌면서 queue 가 빌 때까지 반복문이 돌아간 횟수를 구한다 = 연결된 노드의 개수
 * */
public class Bj2606 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[][] graph = new int[n+1][n+1];

        while (m > 0) {
            m--;

            StringTokenizer st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            graph[i][j] = graph[j][i] = 1;
        }

        boolean[] visited = new boolean[n+1];
        Arrays.fill(visited, false);
        visited[0] = true;

        bfs(graph, visited, 1);
        System.out.println(getVisited(visited));
    }

    private static int getVisited(boolean[] visited) {
        int count = -2;
        for (boolean v : visited) {
            if (v) {
                count++;
            }
        }
        return count;
    }

    private static void bfs(int[][] graph, boolean[] visited, int s) {
        visited[s] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);

        while (!queue.isEmpty()) {
            int i = queue.poll();

            for (int j = 0; j < graph[i].length; j++) {
                if (graph[i][j] == 1 && !visited[j]) {
                    visited[j] = true;
                    queue.add(j);
                }
            }
        }
    }
}
