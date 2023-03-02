package practice.algorithm.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 피보나치수
 * - 캐싱을 적용하여 시간복잡도 낮추기
 * */
public class Fibonacci2 {

    private static int[] cache;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        cache = new int[n+1];
        Arrays.fill(cache, 0);

        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int idx) {
        if (idx <= 2) {
            return cache[idx] = 1;
        }

        if (cache[idx] > 0) {
            return cache[idx];
        }

        return cache[idx] = fibonacci(idx-1) + fibonacci(idx-2);
    }
}
