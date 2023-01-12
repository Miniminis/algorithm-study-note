package practice.algorithm.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1012
 * 16176 kb / 184 ms
 * 유기농 배추
 * 접근방법
 * - 행렬을 bfs 로 순회하며 연결된 덩어리의 개수를 구한다.
 * 1. x, y는 범위 이내여야한다. 0<=x, y<=m, n
 * 2. flag : 벽이면 0, 배추이면 1, 방문했다면 2
 * 3. 방문의 조건 : 1일 때 = 0도 아니고, 2도 아닐 때
 * 4. 시작점에서 연결된 모든 곳을 방문했다면 -> 다음 시작점 공급받기 -> getNotVisited()
 * 5. 4번 반복의 횟수 = 배추흰지렁이의 마리수
 * */
public class Bj1012 {
    private static final int NOT_VISITED = 1;
    private static final int VISITED = 2;

    private static int m, n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t > 0) {
            t--;

            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[][] field = new int[m][n];

            while (k > 0) {
                k--;

                st = new StringTokenizer(br.readLine());
                int i = Integer.parseInt(st.nextToken());
                int j = Integer.parseInt(st.nextToken());

                field[i][j] = 1;
            }

            int count = 0;
            while (true) {
                int[] notVisited = getNotVisited(field);
                if (notVisited[0] == -1) {
                    break;
                }

                search(field, notVisited[0], notVisited[1]);
                count++;
            }
            System.out.println(count);
        }
    }

    private static int[] getNotVisited(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == NOT_VISITED) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    private static void search(int[][] field, int i, int j) {
        if (i < 0 || j < 0 || i >= m || j >= n) {
            return;
        }

        if (field[i][j] != NOT_VISITED) {
            return;
        }

        field[i][j] = VISITED;
        search(field, i-1, j);
        search(field, i, j+1);
        search(field, i+1, j);
        search(field, i, j-1);
    }
}
