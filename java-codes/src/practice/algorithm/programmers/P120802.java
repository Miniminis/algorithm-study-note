package practice.algorithm.programmers;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120802
 * 두 수의 합
 * - 서로 다른 두 수를 더한 결과를 출력하는 문제
 * 내가 간과한 것
 * 1. 범위 체크를 누락한 것.
 * - 원래 코드대로라면, 범위 밖의 수가 들어와도 정상적으로 값을 응답하게 된다.
 * */
public class P120802 {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(-50000, 50000));
    }

    static class Solution {
        public int solution(int num1, int num2) {
            return num1 + num2;
        }
    }

    static class Solution2 {
        public int solution(int num1, int num2) {
            int answer = -1;
            boolean isValid = -50000 <= num1 && num1 <= 50000 && -50000 <= num2 && num2 <= 50000;
            if (isValid) {
                answer = num1 + num2;
            }
            return answer;
        }
    }
}
