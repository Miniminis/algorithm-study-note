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

/**
 * 문제
 * 오른쪽 그림과 같이 삼각형이 나선 모양으로 놓여져 있다. 첫 삼각형은 정삼각형으로 변의 길이는 1이다. 그 다음에는 다음과 같은 과정으로 정삼각형을 계속 추가한다. 나선에서 가장 긴 변의 길이를 k라 했을 때, 그 변에 길이가 k인 정삼각형을 추가한다.
 * 파도반 수열 P(N)은 나선에 있는 정삼각형의 변의 길이이다. P(1)부터 P(10)까지 첫 10개 숫자는 1, 1, 1, 2, 2, 3, 4, 5, 7, 9이다.
 * N이 주어졌을 때, P(N)을 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, N이 주어진다. (1 ≤ N ≤ 100)
 *
 * 출력
 * 각 테스트 케이스마다 P(N)을 출력한다.
 *
 * 예제
 * - 입력
 * 2
 * 6
 * 12
 *
 * - 출력
 * 3
 * 16
 * */
