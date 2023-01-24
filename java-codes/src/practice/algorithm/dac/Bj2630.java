package practice.algorithm.dac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/2630
 * 색종이 만들기
 * 15668 kb / 164 ms
 * */
public class Bj2630 {

    private static final int WHITE_COLOR = 0;
    private static final int BLUE_COLOR = 1;

    private static int white, blue;
    private static int[][] paper;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        paper = new int[n][n];

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 0,0부터 n,n까지 범위 내에서 검사
        // 최초 요소와 하나라도 다른 것이 있다면, 다시 4등분 재귀호출
        // n==1이면, 자동으로 재귀탈출 하면서 cnt + 1

        divide(0, 0, n);
        System.out.println(white);
        System.out.println(blue);
    }

    private static void divide(int x, int y, int n) {
        if (checkColor(x, y, n)) {
            if (paper[x][y] == WHITE_COLOR) {
                white++;
            } else {
                blue++;
            }
            return;
        }

        n /= 2;
        divide(x, y, n);
        divide(x+n, y, n);
        divide(x, y+n, n);
        divide(x+n, y+n, n);
    }

    private static boolean checkColor(int x, int y, int n) {
        int baseColor = paper[x][y];
        for (int i = x; i < x+n; i++) {
            for (int j = y; j < y+n; j++) {
                if (paper[i][j] != baseColor) {
                    return false;
                }
            }
        }
        return true;
    }
}
