package practice.algorithm.programmers;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120806
 * 두 수의 나눗셈
 * */
public class P120806 {
    public static void main(String[] args) {
        System.out.println(new Solution2().solution(1, 16));

    }

    static class Solution {
        public int solution(int num1, int num2) {
            boolean isValid = 0 < num1 && num1 <= 100 && 0 < num2 && num2 <= 100;

            int answer = 0;
            if (isValid) {
                answer = (int) Math.floor((double) num1 / (double) num2 * 1000.0);
            }
            return answer;
        }
    }

    static class Solution2 {
        public int solution(int num1, int num2) {
            boolean isValid = 0 < num1 && num1 <= 100 && 0 < num2 && num2 <= 100;

            int answer = 0;
            if (isValid) {
                answer = (int) ((double) num1 / (double) num2 * 1000);
            }
            return answer;
        }
    }
}
