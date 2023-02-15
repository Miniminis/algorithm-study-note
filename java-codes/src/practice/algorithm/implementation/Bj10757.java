package practice.algorithm.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/10757
 * 큰 수 A+B
 * 1. 서로 다른 두 수 a, b 를 입력받는다.
 * 2. 각 수의 자리수를 하나씩 더한다.
 *  - 올림발생시
 *      - 올림수 변수에 1을 추가해주고 매번 덧셈 전에 확인해준다.
 *      - 현재 계산하던 것은 /%10 해주어 1의 자리수만 올 수 있도록 한다.
 * 3. 두 수의 자리수가 다를 경우,
 * 28m35s
 * */
public class Bj10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = br.readLine().split(" ");
        int limit = Math.max(numbers[0].length(), numbers[1].length());

        StringBuilder sb = new StringBuilder();
        int over = 0;

        for (int i = 0; i < limit; i++) {
            int a = getNum(numbers[0], i);
            int b = getNum(numbers[1], i);

            int sum = a + b + over;
            if (sum >= 10) {
                over = 1;
                sum %= 10;
            } else {
                over = 0;
            }

            sb.insert(0, sum);
        }

        if (over != 0) {
            sb.insert(0, over);
        }

        System.out.println(sb);
    }

    private static int getNum(String number, int index) {
        int charIdx = number.length() - 1 - index;
        if (charIdx < 0) {
            return 0;
        }

        return Character.getNumericValue(number.charAt(charIdx));
    }
}
