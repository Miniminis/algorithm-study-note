package practice.algorithm.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/2178
 * 14728 kb / 140 ms
 * 미로탐색
 * - n * m 의 미로, 2 <= n, m <= 100
 * - status
 *      - 1 : 길
 *      - 0 : 벽
 * - 목표 : 1,1 출발 -> n,m 도착하는 최소 칸의 수를 구하라 (시작위치, 도착위치 포함)
 * 접근방법
 * - 초기화
 *  - 입력값 n, m 으로 미로
 * - 시작점 1, 1에서부터 bfs 시작
 *  - 탐색할 때마다, queue 에 요소 추가
 *  - 미로의 값은 +1 하여 거리도 같이 계산할 수 있도록 함
 * - n, m 도달했을 때 미로 값 = 출력값
 * */

class Position {
    int n;
    int m;

    public Position(int n, int m) {
        this.n = n;
        this.m = m;
    }
}

public class Bj2178 {

    private static final int PATH = 1;

    private static int n, m;

    private static final int[] dn = {-1, 0, 1, 0};
    private static final int[] dm = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int[][] maze = new int[n][m];

        for (int i = 0; i < n; i++) {
            String input = br.readLine();

            for (int j = 0; j < m; j++) {
                maze[i][j] = Character.getNumericValue(input.charAt(j));
            }
        }

        System.out.println(bfs(maze));
    }

    private static int bfs(int[][] maze) {
        Queue<Position> queue = new LinkedList<>();
        queue.add(new Position(0, 0));

        while(!queue.isEmpty()) {
            Position current = queue.poll();

            for (int k = 0; k < dm.length; k++) {
                int nextN = current.n + dn[k];
                int nextM = current.m + dm[k];

                if (nextN < 0 || nextM < 0 || nextN >= n || nextM >= m) {
                    continue;
                }

                if (maze[nextN][nextM] != PATH) {
                    continue;
                }

                maze[nextN][nextM] = maze[current.n][current.m] + 1;
                queue.add(new Position(nextN, nextM));
            }
        }

        return maze[n-1][m-1];
    }
}
