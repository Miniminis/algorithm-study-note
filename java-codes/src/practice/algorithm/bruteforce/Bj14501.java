package practice.algorithm.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/14501
 * 퇴사
 * 결과
 * - 14392 kb / 124 ms
 * 회고
 * 1. 점화식은 쉽게 생각해냈는데, 날짜를 처음부터 하나씩 선택해가면서 dp 값을 구하는 과정을 생각해내지 못했다.
 * - 처음부터 넣지않고 고려하는 방식도 dp 에 모두 포함되는 것인지 궁금하다.
 * 2. 그 이외에 나머지는 모두 큰 무리없이 이해갔다.
 * */
public class Bj14501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] t = new int[n];
        int[] p = new int[n];
        int[] dp = new int[n+1];

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            if (i + t[i] <= n) {
                dp[i+t[i]] = Math.max(dp[i + t[i]], dp[i]+p[i]);
            }
            dp[i+1] = Math.max(dp[i+1], dp[i]);
        }

        System.out.println(dp[n]);
    }
}
