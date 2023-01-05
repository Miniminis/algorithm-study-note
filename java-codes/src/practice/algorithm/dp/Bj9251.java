package practice.algorithm.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/9251
 * LCS
 * 18444 kb / 152 ms
 * */
public class Bj9251 {
    private static int[][] c;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();

        c = new int[s1.length()+1][s2.length()+1];

        System.out.println(lcs(s1, s2));
    }

    private static int lcs(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        for (int i = 0; i <= n; i++) {
            c[i][0] = 0;
        }

        for (int j = 0; j <= m; j++) {
            c[0][j] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    c[i][j] = c[i-1][j-1] + 1;
                    continue;
                }

                c[i][j] = Math.max(c[i-1][j], c[i][j-1]);
            }
        }

        return c[n][m];
    }
}

/**
 * 문제
 * LCS(Longest Common Subsequence, 최장 공통 부분 수열)문제는 두 수열이 주어졌을 때, 모두의 부분 수열이 되는 수열 중 가장 긴 것을 찾는 문제이다.
 * 예를 들어, ACAYKP와 CAPCAK의 LCS는 ACAK가 된다.
 *
 * 입력
 * 첫째 줄과 둘째 줄에 두 문자열이 주어진다. 문자열은 알파벳 대문자로만 이루어져 있으며, 최대 1000글자로 이루어져 있다.
 *
 * 출력
 * 첫째 줄에 입력으로 주어진 두 문자열의 LCS의 길이를 출력한다.
 *
 * 예시
 * - 입력
 * ACAYKP
 * CAPCAK
 *
 * - 출력
 * 4
 * */
