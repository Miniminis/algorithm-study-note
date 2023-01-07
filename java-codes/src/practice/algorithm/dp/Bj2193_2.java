package practice.algorithm.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/2193
 * 이친수
 * - Bj2193 에서 푼 문제를 bottom-up 방식으로 다시 풀어본다.
 * 결과
 * - 14188 kb / 124 ms
 * */
public class Bj2193_2 {
    private static final long[] cache = new long[91];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(transformedBinaryNumber(n));
    }

    private static long transformedBinaryNumber(int n) {
        cache[1] = cache[2] = 1;

        for (int i = 3; i <= n; i++) {
            cache[i] = cache[i-1] + cache[i-2];
        }

        return cache[n];
    }
}

/**
 * 1<=n<=90
 * n=1, 1 -> 1
 * n=2, 10 -> 1
 * n=3, 100, 101 -> 2
 * n=4, 1000, 1001, 1010 -> 3
 * n=5, 10000, 10100, 10010, 10001, 10101 -> 5
 * n=6, 100000, 101000, 100100, 100010, 100001, 101010, 100101, 101001 -> 8
 * -> f(n) = f(n-1) + f(n-2)
 * */
