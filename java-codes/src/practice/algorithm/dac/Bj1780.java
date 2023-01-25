package practice.algorithm.dac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1780
 * 종이의 개수
 * - 전형적인 분할정복문제. 지난번 풀었던 색종이 만들기 문제와도 유사해보인다.
 * - -1, 0, 1 각각의 개수를 세줄에 걸쳐서 출력해야한다.
 * 결과
 * - 고민 4분 / 풀이 20분
 * - 311124 kb / 852 ms
 * */
public class Bj1780 {

    private static final int MINUS_ONE = -1;
    private static final int ZERO = 0;
    private static final int ONE = 1;

    private static int[][] papers;
    private static int minus, zero, one = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        papers = new int[n][n];

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                papers[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        divide(0, 0, n);
        System.out.println(minus);
        System.out.println(zero);
        System.out.println(one);
    }

    private static void divide(int x, int y, int n) {
        if (checkNums(x, y, n)) {
            int base = papers[x][y];

            if (base == MINUS_ONE) {
                minus++;
            } else if (base == ZERO) {
                zero++;
            } else {
                one++;
            }
            return;
        }

        int nextN = n / 3;
        for (int i = x; i < x+n; i += nextN) {
            for (int j = y; j < y+n; j += nextN) {
                divide(i, j, nextN);
            }
        }
    }

    private static boolean checkNums(int x, int y, int n) {
        int base = papers[x][y];

        for (int i = x; i < x+n; i++) {
            for (int j = y; j < y+n; j++) {
                if (papers[i][j] != base) {
                    return false;
                }
            }
        }
        return true;
    }
}
