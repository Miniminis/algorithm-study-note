package practice.algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/13305
 * 주유소
 * - 최소비용으로 왼->오 도시 이동하는 비용
 * - 각 도시에는 주유소, 주유가격
 * - 도로에는 1km 당 1리터의 기름 사용
 * 접근방법
 *  2 3 1
 *  5-2-4-1
 *  - 가격이 가장 싼 곳에서 기름을 왕창넣고 달리는 것이 가장 저렴할 듯
 *  - 가격이 가장 싼 곳이 어디냐에 따라 다를 듯
 *  - 주유하는 시점 : 내림차순일 경우 : 5->2 : ok, 2->4 : no
 * 결과
 * - 34960 kb / 392 ms
 * 반성하기
 * 1. 주유하는 시점을 찾는 아이디어를 빠르게 찾지 못했다.
 * - 가장 저렴한 곳이 아니라, 이후의 도시가 내 가격보다 비싸면, 해당 도시는 고려 대상에서 제외하고 충전하고 간다는 마음이 있어야 한다.
 * */
public class Bj13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] distance = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long[] cost = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long totalCost = 0;

        for (int i = 0; i < n-1; i++) {
            if (cost[i] >= cost[i+1]) {
                totalCost += cost[i] * distance[i];
                continue;
            }
            distance[i+1] += distance[i];
            cost[i+1] = cost[i];
        }
        System.out.println(totalCost);
    }
}
