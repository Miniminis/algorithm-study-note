package practice.algorithm.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/11727
 * 2×n 타일링 2
 *
 * 문제
 * 2×n 직사각형을 1×2, 2×1과 2×2 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
 * 아래 그림은 2×17 직사각형을 채운 한가지 예이다.
 *
 * 입력
 * 첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)
 * 예시 - 2
 *
 * 출력
 * 첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
 * 예시 - 3
 *
 * 접근방법
 * 1. 규칙찾기
 * n 2*n 개수
 * 1 2*1 1
 * 2 2*2 3 = 1, 1, 1
 * 3 2*3 5 = 1, 2, 2
 * 4 2*4 11 = (0)1, (1)3+3, (2)1+1+1+1
 * 5 2*5 21 = (0)1, (1)4+4 (2)3, 3, 3, 3
 * ...
 * 1000
 *
 * -> d(n) = d(n-1) + 2*d(n-2)
 *
 * 결과
 * 14320 kb / 132 ms
 * */
public class Bj11727 {
    private static final int[] cache = new int[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(upgradedFib(n));
    }

    private static int upgradedFib(int n) {
        cache[1] = 1;
        cache[2] = 3;

        for (int i = 3; i <= n; i++) {
            cache[i] = (cache[i-1] + 2 * cache[i-2]) % 10007;
        }
        return cache[n];
    }
}
