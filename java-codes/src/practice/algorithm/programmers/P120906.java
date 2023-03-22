package practice.algorithm.programmers;

import java.util.Arrays;

/**
 * 자릿수 더하기
 * */
public class P120906 {
    public static void main(String[] args) {

    }

    class Solution {
        public int solution(int n) {
            int answer = 0;
            while (n >= 10) {
                answer += n % 10;
                n = n / 10;
            }

            if (n != 0) {
                answer += n;
            }
            return answer;
        }
    }

    class Solution2 {
        public int solution(int n) {
            return Arrays.stream(String.valueOf(n).split(""))
                    .mapToInt(Integer::parseInt)
                    .sum();
        }
    }
}
