package practice.algorithm.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/4963
 * 16904 kb / 188 ms
 * 섬의 개수
 * - 가로, 세로, 대각선으로 연결되어있는 사각형 = 하나의 섬
 * - 0 <= w, h <= 50
 * - 1 : ground, 0 : sea
 * - 0, 0 : 프로그램 종료
 * 접근방법
 * - w, h -> 사각형 지도의 좌표정보 입력 받기 -> 0, 0까지 반복실행
 * - 입력정보 int[][] map 에 담기
 * - 이동할 수 있는 방향키 미리 정의하기 : 상하좌우대각선의 8가지 케이스 배열로 dX[], dY[]
 * - map 을 bfs 순회
 *      - 범위 이내의 좌표가 아니면 종료
 *      - 한번 방문한 곳은 VISITED=2 처리하여 중복방문 안되도록 함
*  - 총 몇 번의 bfs 를 순회했는지 count++ 하여 출력
 * */
public class Bj4963_bfs {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    private static final int NOT_VISITED = 1;
    private static final int VISITED = 2;

    private static final int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
    private static final int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};

    private static int w = 0;
    private static int h = 0;

    private static class Node {
        private final int x;
        private final int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        while(true) {
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if (w == 0 && h == 0) {
                break;
            }

            sb.append(countIsland()).append("\n");
        }
        System.out.println(sb);
    }

    private static int countIsland() throws IOException {
        int[][] map = new int[h][w];

        for (int i = 0; i < h; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < w; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (map[i][j] == NOT_VISITED) {
                    bfs(map, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    private static void bfs(int[][] map, int i, int j) {
        map[i][j] = VISITED;
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(i, j));

        while(!queue.isEmpty()) {
            Node current = queue.poll();

            for (int x : dx) {
                for (int y : dy) {
                    int nextX = current.x + x;
                    int nextY = current.y + y;

                    if (nextX < 0 || nextY < 0 || nextX >= h || nextY >= w) {
                        continue;
                    }

                    if (map[nextX][nextY] != NOT_VISITED) {
                        continue;
                    }

                    map[nextX][nextY] = VISITED;
                    queue.add(new Node(nextX, nextY));
                }
            }
        }
    }
}
