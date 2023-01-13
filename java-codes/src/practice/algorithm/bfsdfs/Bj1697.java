package practice.algorithm.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1697
 * 20232 kb / 188 ms
 * 숨바꼭질
 * - n, k
 * - 위치가 x일 때, x+1, x-1로 걷거나 || 2*x 순간이동
 * - 구하고자 하는 것 : n == k 가 되는 가장 빠른 시간 찾기
 * 예시) 5 -> 17 : 5-10-20-19-18-17 -> 5 / 5-10-9-18-17 -> 4
 * 접근방법
 * - 발생할 수 있는 케이스는 3가지씩 : x-1, x+1, x*2
 * - 세 가지 경우의 수에 대하여 각각 bfs 반복한다.
 * - 방문한 곳에는 그 지점까지 도달한 최초의 시간 초가 세팅되도록 하여, 이후에 해당 지점을 방문한 것을 체크하지 않도록 한다 -> 그래야 해당 지점까지 방문한 최소 시간이 기록된다.
 * - 마지막 목표 지점을 인덱스로 하는 배열의 값을 구하면 해당 지점까지의 최소 시간이 기록된다.
 * */
public class Bj1697 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] visited = new int[100001];
        System.out.println(bfs(n, k, visited));
    }

    private static int bfs(int n, int k, int[] visited) {
        int result = 0;

        visited[n] = 1;  //방문 표시를 위해 1로 표시 추후 결과값에서 -1 필요
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            int moveCase = 3;
            int next = 0;

            if (current == k) {
                result = visited[current];
            }

            for (int i = 0; i < moveCase; i++) {
                if (i == 0) {
                    next = current -1;
                }

                if (i == 1) {
                    next = current + 1;
                }

                if (i == 2) {
                    next = current * 2;
                }

                if (next >= 0 && next < visited.length && visited[next] == 0) {
                    visited[next] = visited[current] + 1;
                    queue.add(next);
                }
            }
        }
        return result-1;    //최초 시작시, +1초하여 계산하였기에 -1 해줌
    }
}
