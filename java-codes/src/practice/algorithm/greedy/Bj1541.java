package practice.algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/1541
 * 잃어버린 괄호
 * 1. 목표 : 최소값 만들기
 * 2. 방법
 * - +연산을 먼저 수행한 뒤, -연산을 수행한다. -> ex. 10-100+200-50+20-10-50
 * - - 를 기준으로 배열을 형성한 뒤, + 기준으로 세부 배열을 하나 더 생성해서 +값을 먼저 계산산 뒤, -연산을 할 수 있도록 한다.
 * 결과
 * - 14452 kb / 132 ms
 * */
public class Bj1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] minusStrs = br.readLine().split("-");
        int[] minusNums = new int[minusStrs.length];

        for (int i = 0; i < minusStrs.length; i++) {
            int[] plusNums = Arrays.stream(minusStrs[i].split("\\+")).mapToInt(Integer::parseInt).toArray();

            int num = 0;
            for (int n : plusNums) {
                num += n;
            }
            minusNums[i] = num;
        }

        int result = 0;
        for (int i = 0; i < minusNums.length; i++) {
            if (i == 0) {
                result += minusNums[i];
                continue;
            }
            result -= minusNums[i];
        }

        System.out.println(result);
    }
}
