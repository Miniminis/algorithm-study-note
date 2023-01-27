package practice.algorithm.dac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/2447
 * 별찍기 - 10
 * - 전형적인 분할정복법 문제.
 * - 차이점은 한번 나눌때 9조각씩 나누어진다는 점. 가로 3등분, 세로 3등분 하여 처리한다.
 * 58316 kb / 376 ms
 * */
public class Bj2447 {

    private static final int STAR = 1;
    private static int[][] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        graph = new int[n][n];

        divide(0, 0, n);
        printStars(n);
    }

    private static void printStars(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < n; j++) {
                if (graph[i][j] == STAR) {
                    sb.append("*");
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    private static void divide(int x, int y, int n) {
        if (n == 3) {
            drawStar(x, y, n);
            return;
        }

        int nextN = n / 3;

        for (int i = x; i < x+n; i += nextN) {
            for (int j = y; j < y+n; j += nextN) {
                if (i == x + nextN && j == y + nextN) {
                    continue;
                }
                divide(i, j, nextN);
            }
        }
    }

    private static void drawStar(int x, int y, int n) {
        for (int i = x; i < x+n; i++) {
            for (int j = y; j < y+n; j++) {
                if (i == x+1 && j == y+1) {
                    continue;
                }
                graph[i][j] = 1;
            }
        }
    }
}
