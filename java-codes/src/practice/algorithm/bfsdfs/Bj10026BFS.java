package practice.algorithm.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * https://www.acmicpc.net/problem/10026
 * 15140 kb / 140 ms
 * 적록색약
 * 조건
 *  - 일반인 : 빨강, 파랑, 초록
 *  - 적록색약 : 빨강(=초록), 파랑
 * - 그림 input : 1 <= n <= 100, n*n / R, G, B
 * - 목표 : 적록색약 아닌 사람이 보았을 때의 구역의 수 / 적록색약이 봤을 때의 구역의 수
 * 접근방법
 * - 적록색약인 사람과 아닌 사람의 그림을 따로따로 두 번 세팅한다.
 * - 0,0 -> n-1,n-1 까지 순회하여 모든 요소들이 방문처리 되도록 한다.
 * - 현재 위치와 같은 색이면 queue에 넣고, 아니면 stop
 * */

public class Bj10026BFS {
    private static final char VISITED = 'V';
    private static final char GREEN = 'G';
    private static final char RED = 'R';

    private static final int[] dx = {-1, 0, 1, 0};  //row
    private static final int[] dy = {0, 1, 0, -1};  //column

    private static int n;

    private static class Node {
        private final int x;
        private final int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        char[][] picture = new char[n][n];
        char[][] noGreenPicture = new char[n][n];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            for (int j = 0; j < n; j++) {
                char input = str.charAt(j);
                picture[i][j] = input;

                if (input == GREEN) {
                    input = RED;
                }
                noGreenPicture[i][j] = input;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(countSection(picture)).append(" ").append(countSection(noGreenPicture));

        System.out.println(sb);
    }

    private static int countSection(char[][] picture) {
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (picture[i][j] != VISITED) {
                    bfsPicture(picture, i, j);
                    cnt++;
                }
            }
        }

        return cnt;
    }

    private static void bfsPicture(char[][] picture, int i, int j) {
        char color = picture[i][j];
        picture[i][j] = VISITED;
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(i, j));

        while(!queue.isEmpty()) {
            Node current = queue.poll();

            for (int k = 0; k < 4; k ++) {
                int nextX = current.x + dx[k];
                int nextY = current.y + dy[k];

                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= n) {
                    continue;
                }

                if (picture[nextX][nextY] == VISITED) {
                    continue;
                }

                if (picture[nextX][nextY] != color) {
                    continue;
                }

                picture[nextX][nextY] = VISITED;
                queue.add(new Node(nextX, nextY));
            }
        }
    }
}

