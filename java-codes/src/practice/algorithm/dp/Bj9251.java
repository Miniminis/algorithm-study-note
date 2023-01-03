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
