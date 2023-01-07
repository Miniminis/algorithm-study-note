package practice.algorithm.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/2193
 * 이친수
 * - 1부터 6까지 경우의 수를 구해보니, f(n) = f(n-1) + f(n-2) 와 같은 규칙을 발견하였다.
 * - 익숙한 피보나치 수열 로직이라서 memoization 방법을 적용하여 cache 배열에 이전 계산값을 저장하는 방식으로 진행하였다.
 * - 1회차 - 실패 : n이 90까지 넘어가니, int 의 범위가 부족할 수 있다는 생각을 하지 못했다.
 * - 2회차 - 성공 : int[] cache 배열을 long type 으로 변경하고 다시 시도했다.
 * 결과
 * - 14188 kb / 124 ms
 * */
public class Bj2193 {
    private static final long[] cache = new long[91];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Arrays.fill(cache, -1);
        System.out.println(transformedBinaryNumber(n));
    }

    private static long transformedBinaryNumber(int n) {
        if (cache[n] != -1) {
            return cache[n];
        }

        if (n == 1) {
            cache[n] = 1;
            return 1;
        }

        if (n == 2) {
            cache[n] = 1;
            return 1;
        }

        cache[n] = transformedBinaryNumber(n-1) + transformedBinaryNumber(n-2);
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
