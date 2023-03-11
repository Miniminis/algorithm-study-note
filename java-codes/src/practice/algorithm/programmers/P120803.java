package practice.algorithm.programmers;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120803
 * 두 수의 차
 * - 서로 다른 두 수를 뺀 결과
 * */
public class P120803 {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(-50002, 50000));
    }

    static class Solution {
        public int solution(int num1, int num2) {
            boolean isValid = -50000 <= num1 && num1 <= 50000 && -50000 <= num2 && num2 <= 50000;
            int answer = 0;
            if (isValid) {
                answer = num1 - num2;
            }
            return answer;
        }
    }
}
