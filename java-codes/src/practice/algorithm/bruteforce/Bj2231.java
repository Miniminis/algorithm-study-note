package practice.algorithm.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/2231
 * 분해합
 * 14208 kb / 140 ms
 * 접근방법
 * - 주어진 수 N에서 어떤 수 i 만큼을 뺀 뒤 각 자리 수 만큼 빼주어야 한다.
 * - 각 자리수만큼 빼기 위해서 -i%10 을 하고, i를 다시 i/10 으로 설정해준다.
 * - 위를 i >= 1 인동안 계속 반복하게 되면, 자연스럽게 마지막 자리만 계속 빼주는 형태로 식이 진행된다.
 * - 만약 모든 반복문을 돌았는데도 n!=0 인 경우는 생성자가 없는 경우이므로, 0을 반환한다.
 * - i를 1부터 반복 시작하기 때문에, 자연스럽게 위의 식을 만족하는 값이 구해지는 최초의 값이 최소값이 된다.
 * */
public class Bj2231 {
    public static void main(String[] args) throws IOException {
        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        //x/10 -> x, x%10=뺄셈할 수
        //x = N - x/10 - x/100 ...
        int result = 0;
        for (int i = 1; i <= 1000000; i++) {
            if (findConstructor(n, i)) {
                result = i;
                break;
            };
        }

        System.out.println(result);
    }

    private static boolean findConstructor(int n, int i) {
        n -= i;
        if (n <= 0) {
            return false;
        }

        while (i >= 1) {
            n -= i % 10;
            i /= 10;
        }

        return n == 0;
    }
}
