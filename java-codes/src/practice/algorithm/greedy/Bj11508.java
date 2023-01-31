package practice.algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/11508
 * 2+1 세일
 * - 최소비용으로 유제품을 구입한다.
 * - 11 + 10 = 21 / 655 455 = 11+10 / 645 555 = 11+10 = 21
 * - 1 ≤ N ≤ 100,000
 * - 1 ≤ Ci ≤ 100,000
 * 결과
 * - 27232 kb / 352 ms
 * 접근방법
 * - 정렬한 뒤, 뒤에서부터 내림차순으로 조회한다.
 * - 이떄, 한 루프당 범위는 3이고, 마지막 2개의 값만 더한 뒤, 3개의 값을 모두 0으로 만든다.
 * - index>=2 일떄까지 계속 진행한다.
 * - 마지막에 0부터 2까지의 값 중에서 아직 0으로 변하지 않은 값이 있다면 더해준다.
 * - 출력한다.
 * */
public class Bj11508 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(prices);

        int total = 0;
        for (int i = n-1; i >= 2; i-=3) {
            total += prices[i] + prices[i-1];
            prices[i] = prices[i-1] = prices[i-2] = 0;
        }

        for (int i = 0; i < 3; i++) {
            if(prices[i] != 0) {
                total += prices[i];
            }
        }

        System.out.println(total);
    }
}
