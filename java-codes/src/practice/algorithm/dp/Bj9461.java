package practice.algorithm.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/9461
 * 파도반수열
 * - memoization 방식
 * */
public class Bj9461 {
    private static long[] cache;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t > 0) {
            t--;

            int n = Integer.parseInt(br.readLine());
            cache = new long[n+1];
            Arrays.fill(cache, -1);

            long result = p(n);
            sb.append(result).append("\n");
        }

        System.out.println(sb);
    }

    private static long p(int n) {
        if (cache[n] > -1) {
            return cache[n];
        }

        if (n <= 3) {
            cache[n] = 1;
            return 1;
        }

        if (n == 4 || n == 5) {
            cache[n] = 2;
            return 2;
        }

        cache[n] = p(n-1) + p(n-5);
        return cache[n];
    }


    /**
     * 규칙찾기
     * 1
     * 1
     * 1
     * 2 = 1+1
     * 2
     * 3 = 2+1
     * 4 = 3+1
     * 5 = 4+1
     * 7 = 5+2
     * 9 = 7+2
     * 12 = 9+3
     * 16 = 12+4
     * 21 = 16+5
     * p(1)~p(5) = 1, 1, 1, 2, 2
     * p(n) = p(n-1) + p(n-5)
     * */
}
