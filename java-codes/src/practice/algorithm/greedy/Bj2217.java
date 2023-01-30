package practice.algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/2217
 * 로프
 * */
public class Bj2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] ropes = new int[n];

        for (int i = 0; i < n; i++) {
            ropes[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(findMaxWeight(ropes, n));
    }

    private static int findMaxWeight(int[] ropes, int n) {
        Arrays.sort(ropes);

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            //어떤 로프 a 를 사용하고 있을 때, 그 로프보다 무게가 무거운, 즉 그 로프보다 배열상에서 뒤에 존재하는 로프틑 모두 사용하는 것이 가장 큰 값이다.
            //해당 로프를 사용할 때, 가장 큰 값은 따라서 rope[k] * (n-k) 이다.
            max = Math.max(ropes[i] * (n-i), max);
        }

        return max;
    }
}
