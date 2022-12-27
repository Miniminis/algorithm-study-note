package practice.algorithm.recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


/**
 * https://www.acmicpc.net/problem/10870
 * 14196 kb / 128 ms
 * 피보나치 수 5
 * - 재귀함수를 이용한다.
 * */
public class Bj10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
