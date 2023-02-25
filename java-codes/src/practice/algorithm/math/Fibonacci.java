package practice.algorithm.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 피보나치수
 * - 재귀함수를 이용
 * - 특정번째의 피보나치 수 구하기
 * */
public class Fibonacci {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n) {
        if (n < 2) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
