package practice.algorithm.programmers;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120807
 * 숫자 비교하기
 * */
public class P120807 {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(2, 3));
    }

    static class Solution {
        public int solution(int num1, int num2) {
            boolean isValid = 0 <= num1 && num1 <= 10000 && 0 <= num2 && num2 <= 10000;

            int answer = 0;
            if (isValid) {
                answer = num1 == num2 ? 1 : -1 ;
            }
            return answer;
        }
    }
}
