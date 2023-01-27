package practice.algorithm.dac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/1992
 * 쿼드트리
 * - 전형적인 분할정복법으로 풀면된다.
 * 결과
 * - 15024 kb / 148 ms
 * - 25 min
 * */
public class Bj1992 {

    private static int[][] video;

    private static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        video = new int[n][n];

        String[] inputs;

        for (int i = 0; i < n; i++) {
            inputs = br.readLine().split("");

            for (int j = 0; j < n; j++) {
                video[i][j] = Integer.parseInt(inputs[j]);
            }
        }

        sb = new StringBuilder();

        divide(0, 0, n);
        System.out.println(sb);
    }

    private static void divide(int x, int y, int n) {
        if (check(x, y, n)) {
            int base = video[x][y];
            sb.append(base);
            return;
        }

        n /= 2;
        sb.append("(");
        divide(x, y, n);
        divide(x, y+n, n);
        divide(x+n, y, n);
        divide(x+n, y+n, n);
        sb.append(")");
    }

    private static boolean check(int x, int y, int n) {
        int base = video[x][y];

        for(int i = x; i < x+n; i++) {
            for (int j = y; j < y+n; j++) {
                if (base != video[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
