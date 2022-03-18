package practice.algorithm;

import java.util.*;

public class Main {

    private static int n, m;
    private static int count = 0;

    public static void main(String[] args) {

        /*
        * bfs
        * n,m 입력받기
        * graph 정보 입력받기
        * - list, list
        * graph 정보 확인하기
        *
        * visited 정의 & 초기화
        * bfs 수행
        * - 방문 처리
        * - count ++
        * graph[i] 순회 중, visited[i] false 건 찾아서
        * */

        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        m = Integer.parseInt(sc.nextLine());

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n+1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int j = 0; j < m; j++) {
            String[] connectInfo = sc.nextLine().split(" ");
            int s = Integer.parseInt(connectInfo[0]);
            int e = Integer.parseInt(connectInfo[1]);

            graph.get(s).add(e);
            graph.get(e).add(s);
        }

//        System.out.println("graph = " + graph);

        boolean[] visited = new boolean[101];
        Arrays.fill(visited, false);

        bfs(visited, 1, graph);
        System.out.println(count);
    }

    private static void bfs(boolean[] visited, int i, List<List<Integer>> graph) {
        visited[i] = true;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(i);

        while (!queue.isEmpty()) {
            int v = queue.poll();

            for (int j : graph.get(v)) {
                if (!visited[j]) {
                    visited[j] = true;
                    count += 1;
                    queue.offer(j);
                }
            }
        }
    }
}
