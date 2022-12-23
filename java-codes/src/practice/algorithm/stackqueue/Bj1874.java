package practice.algorithm.stackqueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

/**
 * https://www.acmicpc.net/problem/1874
 * 스택수열
 * 27896 kb / 356 ms
 * - 첫째수 : 전체 1부터 n까지의 수
 * - 둘째 ~ n+1번째수 : 일치시킬 배열의 수
 * - 입력수 > 현재 push 예정 수 : 입력수까지 스택에 넣는다.
 * - peek : 스택 최상단 vs. 입력수 비교하여 같으면, pop, 아니면 NO 출력
 * - n번만큼 반복
 * */
public class Bj1874 {

    private static Stack<Integer> stack = new Stack<>();
    private static StringBuilder sb = new StringBuilder();
    private static int start = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(br.readLine());

            if (value > start) {
                pushUntilValue(value);
                start = value;
            }

            if (stack.peek() != value) {
                printNo();
                return;
            }

            stack.pop();
            appendString(Sign.MINUS.getSign());
        }

        System.out.println(sb);
    }

    private static void printNo() {
        System.out.println("NO");
    }

    private static void pushUntilValue(int value) {
        for (int j = start+1; j <= value; j++) {
            stack.add(j);
            appendString(Sign.PLUS.getSign());
        }
    }

    public static void appendString(String sign) {
        sb.append(sign).append("\n");
    }

     public enum Sign {

        PLUS("+"),
        MINUS("-"),
        ;

        private final String sign;

        Sign(String sign) {
            this.sign = sign;
        }

        public String getSign() {
            return this.sign;
        }
    }
}
