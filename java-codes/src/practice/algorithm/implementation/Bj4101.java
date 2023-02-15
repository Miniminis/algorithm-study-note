package practice.algorithm.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/4101
 * 크냐?
 * 1. 서로 다른 두 수를 입력받는다.
 * 2. a - b 를 하여 양수면 yes, 그외는 no 를 출력한다.
 * 3. 0 0 이 입력될 때까지 위의 과정을 반복한다.
 * 5m30s
 * */
public class Bj4101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while (true) {
            int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::new).toArray();
            int first = nums[0];
            int second = nums[1];

            if (first == 0 && second == 0) {
                break;
            }

            if (first - second > 0) {
                sb.append("Yes").append("\n");
            } else {
                sb.append("No").append("\n");
            }
        }
        System.out.println(sb);
    }
}
