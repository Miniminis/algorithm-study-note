package practice.algorithm.programmers;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120804
 * 두 수의 곱
 * - 서로 다른 두 수를 곱한 결과를 출력한다.
 * - 유효한 범위를 넘어가는 값에 대해서는 0으로 리턴하도록 처리하였다.
 * */
public class P120804 {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(101, 101));
    }

    static class Solution {
        public int solution(int num1, int num2) {
            boolean isValid = 0 <= num1 && num1 <= 100 && 0 <= num2 && num2 <= 100;

            int answer = 0;
            if (isValid) {
                answer = num1 * num2;
            }
            return answer;
        }
    }
}
