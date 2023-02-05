package practice.algorithm.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/19532
 * 수학은 비대면강의 입니다.
 * - 일반 수학 방정식을 코드로 표현하면 된다.
 * - 완전탐색유형이므로 주어진 범위인 -999 ~ 999까지 for 문 돌려주며 탐색하면 된다.
 * 결과
 * - 16488 kb / 196 ms
 * */
public class Bj19532_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int x = -999; x <= 999; x++) {
            for (int y = -999; y <= 999; y++) {
                if (nums[0]*x + nums[1]*y == nums[2]
                        && nums[3]*x + nums[4]*y == nums[5]) {
                    System.out.println(x + " " + y);
                }
            }
        }
    }
}
