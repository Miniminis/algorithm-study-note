package practice.algorithm.stackqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * https://www.acmicpc.net/problem/1874
 * 스택수열
 * 25492 kb / 332 ms
 * - 첫째수 : 전체 1부터 n까지의 수
 * - 둘째 ~ n+1번째수 : 일치시킬 배열의 수
 * - 입력수 > 현재 push 예정 수 : 입력수까지 스택에 넣는다.
 * - peek : 스택 최상단 vs. 입력수 비교하여 같으면, pop, 아니면 NO 출력
 * - n번만큼 반복
 * */
public class Bj1874_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] stack = new int[n];
        int start = 0;
        int idx = 0;
        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            int value = Integer.parseInt(br.readLine());

            if (value > start) {
                for (int i = start+1; i <= value; i++) {
                    stack[idx++] = i;
                    sb.append("+").append("\n");
                }
                start = value;
            }

            if (value != stack[idx-1]) {
                System.out.println("NO");
                return;
            }

            idx--;
            sb.append("-").append("\n");

            n--;
        }

        System.out.println(sb);
    }
}
