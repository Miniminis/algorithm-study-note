package practice.algorithm.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/1003
 * 14056 kb / 124 ms
 * 피보나치 함수
 * - 구해야하는 것 : f(0), f(1) 이 호출되는 각각 횟수
 * */
public class Bj1003 {

    private static int[] zero;
    private static int[] one;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t != 0) {
            int n = Integer.parseInt(br.readLine());
            zero = new int[n+1];
            one = new int[n+1];

            fib(n);
            sb.append(zero[n]).append(" ").append(one[n]).append("\n");

            t--;
            Arrays.fill(zero, 0);
            Arrays.fill(one, 0);
        }

        System.out.println(sb);
    }

    private static void fib(int n) {
        zero[0] = 1;
        if (n == 0) return;

        one[1] = 1;
        if (n == 1) return;

        for (int i = 2; i <= n; i++) {
            zero[i] = zero[i-1] + zero[i-2];
            one[i] = one[i-1] + one[i-2];
        }
    }

    /**
     * 문제
     * 다음 소스는 N번째 피보나치 수를 구하는 C++ 함수이다.
     *
     * int fibonacci(int n) {
     *     if (n == 0) {
     *         printf("0");
     *         return 0;
     *     } else if (n == 1) {
     *         printf("1");
     *         return 1;
     *     } else {
     *         return fibonacci(n‐1) + fibonacci(n‐2);
     *     }
     * }
     * fibonacci(3)을 호출하면 다음과 같은 일이 일어난다.
     *
     * fibonacci(3)은 fibonacci(2)와 fibonacci(1) (첫 번째 호출)을 호출한다.
     * fibonacci(2)는 fibonacci(1) (두 번째 호출)과 fibonacci(0)을 호출한다.
     * 두 번째 호출한 fibonacci(1)은 1을 출력하고 1을 리턴한다.
     * fibonacci(0)은 0을 출력하고, 0을 리턴한다.
     * fibonacci(2)는 fibonacci(1)과 fibonacci(0)의 결과를 얻고, 1을 리턴한다.
     * 첫 번째 호출한 fibonacci(1)은 1을 출력하고, 1을 리턴한다.
     * fibonacci(3)은 fibonacci(2)와 fibonacci(1)의 결과를 얻고, 2를 리턴한다.
     * 1은 2번 출력되고, 0은 1번 출력된다. N이 주어졌을 때, fibonacci(N)을 호출했을 때, 0과 1이 각각 몇 번 출력되는지 구하는 프로그램을 작성하시오.
     *
     * 입력
     * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
     * 각 테스트 케이스는 한 줄로 이루어져 있고, N이 주어진다. N은 40보다 작거나 같은 자연수 또는 0이다.
     *
     * 출력
     * 각 테스트 케이스마다 0이 출력되는 횟수와 1이 출력되는 횟수를 공백으로 구분해서 출력한다.
     *
     * 예시
     * - 입력
     * 3
     * 0
     * 1
     * 3
     *
     * - 출력
     * 1 0
     * 0 1
     * 1 2
     * */


    /**
     * 규칙 찾기
     * n - v    = (0 1)
     * 0 - 0    = 1 0
     * 1 - 1    = 0 1
     * 2 - 0+1  = 1 1
     * 3 = 2 + 1 = 0+1 + 1 = 1 2
     * 4 = 3+2 = 1 2 + 1 1 = 2 3
     * 1, 0
     * 0, 1
     * 1, 1
     * 1, 2
     * 2, 3
     * 3, 5
     * 5, 8
     * 8, 13
     * 13, 21
     * f(n) 까지의 0과 1의 호출 횟수 = f(n-1)까지의 횟수 + f(n-2)까지의 횟수
     * */
}
