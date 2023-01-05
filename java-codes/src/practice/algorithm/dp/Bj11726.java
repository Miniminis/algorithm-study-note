package practice.algorithm.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/11726
 * 2×n 타일링
 *
 * 문제
 * 2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
 * 아래 그림은 2×5 크기의 직사각형을 채운 한 가지 방법의 예이다.
 *
 * 입력
 * 첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)
 *
 * 출력
 * 첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
 *
 * 예시
 * 입력
 * 9
 *
 * 출력
 * 55
 *
 * 접근방식
 * 1) 규칙찾기
 * n 2*n 가짓수
 * 1 2*1 1
 * 2 2*2 2
 * 3 2*3 3
 * 4 2*4 5
 * 5 2*5 8
 * 6 13
 * 7 21
 * 8 34
 * 9 55
 * -> 피보나치 수열의 규칙을 똑같이 적용할 수 있다는 것을 발견했다.
 * 2) 주의하기
 * - 가짓수에 10007개를 나눈 나머지를 출력해야하기 때문에, 사실상 cache 배열에는 10007로 나눈 나머지만 가지고 있어도 된다.
 *
 * 결과
 * - 14384 kb / 132 ms
 * */
public class Bj11726 {

    private static final int[] cache = new int[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long result = fib(n);
        System.out.println(result);
    }

    private static int fib(int n) {
        cache[1] = 1;
        cache[2] = 2;

        for (int i = 3; i <= n; i++) {
            cache[i] = (cache[i-1] + cache[i-2]) % 10007;
        }

        return cache[n];
    }
}
