package practice.algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/11047
 * 동전 0
 * - 14240 kb / 128	ms
 * 접근방법
 * - 주어진 동전 n 개를 최소한으로 이용하여 k 금액을 만든다.
 * - 가장 큰 금액부터 나누기 한다.
 * */
public class Bj11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] money = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            money[i] = Integer.parseInt(br.readLine());
        }

        for (int i = n-1; i >= 0; i--) {
            if (money[i] > k) {
                continue;
            }
            count += k / money[i];
            k %= money[i];

            if (k == 0) {
                break;
            }
        }

        System.out.println(count);
    }
}
