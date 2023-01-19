package practice.algorithm.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1916
 * 51000 kb / 560 ms
 * 최소비용 구하기
 * - n, m, a, b minimum
 * - 도시번호 : 1 ~ n
 * 접근방법
 * - 우선순위큐, 다익스트라 알고리즘을 사용한다.
 * - 모든 노드의 값을 max 값으로 초기화한다.
 * - 시작점부터 우선순위 큐에 넣어서 하나씩 꺼낸 뒤, 해당 지점과 연결된 노드 중, 노드 값이 max 에서 갱신된 경우만 queue 에 넣는다.
 * - 우선순위큐 이므로, 매번 뽑을 때마다 비용의 최소값이 뽑히게 된다.
 *      - 미리 정의할 때, 정렬 기준 비용별로 하도록 세팅 필요
 * */
public class Bj1916 {

    static class Node implements Comparable<Node> {
        int end;      //간선
        int weight;   //가중치
        public Node (int end, int weight) {
            this.end = end;
            this.weight = weight;
        }


        @Override
        public int compareTo(Node o) {
            return weight - o.weight;
        }
    }

    private static ArrayList<ArrayList<Node>> cities;
    static boolean[] visited;
    static int[] distance;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st;

        cities = new ArrayList<>();
        visited = new boolean[n+1];
        distance = new int[n+1];

        Arrays.fill(visited, false);
        Arrays.fill(distance, Integer.MAX_VALUE);

        for (int i = 0; i <= n; i++) {
            cities.add(new ArrayList<>());
        }

        while (m > 0) {
            m--;
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            cities.get(s).add(new Node(e, w));
        }

        st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        System.out.println(dijkstra(s, e));
    }

    private static int dijkstra(int s, int e) {
        distance[s] = 0;

        PriorityQueue<Node> queue = new PriorityQueue<>();
        queue.add(new Node(s, distance[s]));

        while(!queue.isEmpty()) {
            Node currentNode = queue.poll();
            int current = currentNode.end;

            if (visited[current]) {
                continue;
            }

            visited[current] = true;
            for (Node next : cities.get(current)) {
                if (visited[next.end]) {
                    continue;
                }

                if (distance[next.end] > distance[current] + next.weight) {
                    distance[next.end] = distance[current] + next.weight;
                    queue.add(new Node(next.end, distance[next.end]));
                }
            }
        }

        return distance[e];
    }
}
