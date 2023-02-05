package practice.algorithm.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/19532
 * 수학은 비대면강의 입니다.
 * - 일반 수학 방정식을 코드로 표현하면 된다.
 * 결과
 * - 런타임 에러 : x나 y값에 0이 오지 않으리라는 보장이 없다. 0으로 나누게 되는 경우가 발생할 수 있다.
 * */
public class Bj19532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        //nums 0, 1, 2 - nums 3, 4, 5
        int y = (nums[2]*nums[3] - nums[5]*nums[0]) / (nums[1] * nums[3] - nums[4] * nums[0]);
        int x = (nums[2] - nums[1]*y) / nums[0];

        System.out.println(x + " " + y);
    }
}
