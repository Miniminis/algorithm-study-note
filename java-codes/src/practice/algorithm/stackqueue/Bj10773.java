package practice.algorithm.stackqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * https://www.acmicpc.net/problem/10773
 * 24136 kb / 252 ms
 * 제로
 * - 입력받은 수를 0을 제외하고 스택에 차례대로 쌓는다.
 * - 0을 입력받은 경우, 스택에서 가장 상단의 수를 pop 한다.
 * */
public class Bj10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int round = Integer.parseInt(br.readLine());

        Stack<Integer> nums = new Stack<>();
        for (int i = 0; i < round; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                nums.pop();
                continue;
            }
            nums.push(num);
        }

        int sum = 0;
        while(!nums.isEmpty()) {
            sum += nums.pop();
        }

        System.out.println(sum);
    }
}
