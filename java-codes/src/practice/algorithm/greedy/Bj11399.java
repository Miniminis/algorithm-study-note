package practice.algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/11399
 * ATM
 * - 인출하는데 걸리는 시간을 최소화하는 것이 목표
 * - 어떻게 하면 시간을 최소화할 수 있을까?
 * - 걸리는 시간 계산 :
 *      - t[] = 3, 1, 4, 3, 2
 *      - 1, 2, 3, 4, 5 : 무작위 => 3+(3+1)+(3+1+4)
 *      - 2, 5, 1, 4, 3 : 최소 시간 순서 => 1+(1+2)+(1+2+3)+(1+2+3+3) ..
 * 결과
 * - 14672 kb / 140 ms
 * 반성하기
 * 1. 마지막 결과값을 구할 때, 각 사람들의 시간을 전체적으로 더해주는 연산을 누락하였다. 
 * */
public class Bj11399 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] t = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(t);

        int total = t[0];
        for (int i = 1; i < n; i++) {
            t[i] = t[i] + t[i-1];
            total += t[i];
        }

        System.out.println(total);
    }
}
