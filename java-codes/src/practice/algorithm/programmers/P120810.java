package practice.algorithm.programmers;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120810
 * 나머지 구하기
 * */
public class P120810 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int solution(int num1, int num2) {
            boolean isValid = 0 < num1 && num1 <= 100 && 0 < num2 && num2 <= 100;
            int answer = -1;
            if (isValid) {
                answer = num1 % num2;
            }
            return answer;
        }
    }
}
