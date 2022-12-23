package practice.algorithm.stackqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * https://www.acmicpc.net/problem/9012
 * 14416 kb / 132 ms
 * 괄호
 * - 괄호에는 쌍이 있으므로 입력받은 뒤, 문자열을 하나씩 쪼개면서 스택에 넣고, 짝이 만나면 바로 pop 하는 방식으로 진행
 * - 문자열을 다 돌았는데, 아직 스택에 남아있는 원소가 있다면 NO, 비어있다면 YES
 * */
public class Bj9012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalInputCnt = Integer.parseInt(br.readLine());

        StringBuilder checkResult = new StringBuilder();

        for (int i = 0; i < totalInputCnt; i++) {
            String result = checkVps(br.readLine());
            checkResult.append(result).append("\n");
        }
        System.out.println(checkResult);
    }

    private static String checkVps(String parenthesis) {
        Stack<Character> ps = new Stack<>();

        for (int i = 0; i < parenthesis.length(); i++) {
            char c = parenthesis.charAt(i);
            if (c == '(') {
                ps.push(c);
                continue;
            }

            if (ps.isEmpty()) {
                return Result.N.getResult();
            }

            ps.pop();
        }

        //( : 무조건 스택에 넣는다.
        //) : 스택에 ( 남아있는 것이 있다면, pop, 아니면 NO return

        return ps.empty() ? Result.Y.getResult() : Result.N.getResult();  //YES, NO
    }

    public enum Result {

        Y("YES"), N("NO");

        private final String result;

        Result(String result) {
            this.result = result;
        }

        public String getResult() {
            return result;
        }
    }
}
