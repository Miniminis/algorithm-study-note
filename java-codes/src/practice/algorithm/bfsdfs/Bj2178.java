package practice.algorithm.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/2178
 * 30m / 40m
 * 120164 kb / 612 ms
 * 토마토
 * - 상하좌우 4개의 방향으로 영향
 * - 2 <= m, n <= 1000
 * - 상태값
 *      - 1 : 익은 토마토
 *      - 0 : 익지 않은 토마토
 *      - -1 : 토마토 없음
 * - 토마토가 없는 경우는 없다.
 * - 입력 상태에 모든 토마토가 익어있다면 -> 0 출력
 * - 토마토가 모두 익을 수 없다면 -> -1
 * - 목표 : 모든 토마토가 익을 수 있는 최소 일수
 * 접근방법
 * - 초기화
 *      - 토마토 상자 값 n * m
 *      - 방향값 dy, dx
 *      - 시작점 큐 : 입력받을 때, 1이면, 시작점 큐에 추가
 * - 시작점 큐가 빌때까지, bfs 반복
 *      - 매 계산마다 기존 값에서 +1 추가하여 일수 계산
 * - 모든 연산이 끝난 뒤, 토마토 상자 탐색
 *      - 0이 하나라도 존재하면 -1 리턴
 *      - 초기값을 Integer.MinValue 로 설정해두고, 각 배열 요소의 최대값을 구하기
 *          -> 적어도 max 일수는 지나야 상자 내 모든 토마토에 도달할 수 있으므로
 *      - 최대값 구했다면 -1 : 시작값이 0이 아니라 1이기 때문에 정확한 일수 계산을 위해서
 * */
public class Bj2178 {

    private static final int NOT_RIPEN = 0;
    private static final int RIPEN = 1;

    private static int m;
    private static int n;

    private static final int[] dy = {-1, 0, 1, 0};
    private static final int[] dx = {0, 1, 0, -1};

    private static int[][] box;
    private static final Queue<Tomato> tomatoes = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        box = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());

                if (box[i][j] == 1) {
                    tomatoes.add(new Tomato(i, j));
                }
            }
        }

        bfs();
        System.out.println(countDays());
    }

    private static int countDays() {
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (box[i][j] == 0) {
                    return -1;
                }

                result = Math.max(result, box[i][j]);
            }
        }

        return result -1;
    }

    private static void bfs() {
        while (!tomatoes.isEmpty()) {
            Tomato current = tomatoes.poll();

            for (int i = 0; i < dx.length; i++) {
                int nextY = current.y + dy[i];
                int nextX = current.x + dx[i];

                if (nextX < 0 || nextY < 0 || nextX >= m || nextY >= n) {
                    continue;
                }

                if (box[nextY][nextX] != NOT_RIPEN) {
                    continue;
                }

                box[nextY][nextX] = box[current.y][current.x] + RIPEN;
                tomatoes.add(new Tomato(nextY, nextX));
            }
        }
    }
}

class Tomato {
    int y;
    int x;

    public Tomato(int y, int x) {
        this.y = y;
        this.x = x;
    }
}
