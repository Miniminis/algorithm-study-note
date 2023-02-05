package practice.algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/11508
 * 2+1 세일
 * 알고리즘 스터디 이후, 나연언니로부터 다른 접근방식을 추천받아서 다시 풀어본다.
 * - 뒤에서부터 순회하되, 3번째 값만 더한 뒤, 전체 가격에서 빼면 된다.
 * 결과
 * - 25520 kb / 364 ms : 이전 풀이방법보다 메모리는 절약했지만, 시간이 조금 더 오래걸렸다.
 * */
public class Bj11508_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] prices = new int[n];

        int totalPrice = 0;     //나중에 (전체가격) - (할인된 상품 총액) 을 해주기 위해서 구한다.
        for (int i = 0; i < n; i++) {
            prices[i] = Integer.parseInt(br.readLine());    //입력값 배열 생성
            totalPrice += prices[i];    //전체 가격 더하기
        }

        Arrays.sort(prices);

        int discountedTotal = 0;
        for (int i = n-1; i >= 2; i-=3) {
            discountedTotal += prices[i-2];
        }

        System.out.println(totalPrice - discountedTotal);
    }
}
