package practice.algorithm.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/9095
 * 1, 2, 3 더하기
 *
 * 문제
 * 정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.
 * 정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다. n은 양수이며 11보다 작다.
 *
 * 출력
 * 각 테스트 케이스마다, n을 1, 2, 3의 합으로 나타내는 방법의 수를 출력한다.
 *
 * 예제입력
 * 3
 * 4
 * 7
 * 10
 *
 * 예제 출력
 * 7
 * 44
 * 274
 *
 * 접근방법
 * 요구조건 : 1, 2, 3 을 이용하여 숫자 n을 만든다. (1<=n<11)
 * 규칙찾기
 * n - 가짓수
 * 1 [1] = 1
 * 2 [11] [2] = 2
 * 3 [111] [12] [21] [3] = 4
 * 4 [1111] [112][121][211] [22] [13][31] = 7
 * 5 [11111] [2111][1211][1121][1112] [221][212][122] [113][131][311] [23] [32] = 13
 * 7 44
 * 10 274
 *
 * 1 2 4 7 13 24 44
 * f(n) = f(n-1) + f(n-2) + f(n-3)
 *
 * --> bottom up 방식으로 접근한다.
 *
 * 결과
 * - 14160 kb / 128 ms
 * */
public class Bj9095 {

    private static final int[] cache = new int[11];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--;
            Arrays.fill(cache, -1);

            int result = tripleFib(Integer.parseInt(br.readLine()));
            sb.append(result).append("\n");
        }

        System.out.println(sb);
    }

    private static int tripleFib(int n) {
        cache[1] = 1;
        cache[2] = 2;
        cache[3] = 4;

        for (int i = 4; i <= n; i++) {
            cache[i] = cache[i-1] + cache[i-2] + cache[i-3];
        }

        return cache[n];
    }
}
