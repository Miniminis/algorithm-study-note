package practice.algorithm.programmers;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120805
 * 몫구하기
 * - 서로 다른 두 수를 나눈 결과값을 출력
 * - 범위 밖의 수가 입력될 경우는 기본값이 출력되도록 하였다.
 * */
public class P120805 {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(-101, 100));
    }

    static class Solution {
        public int solution(int num1, int num2) {
            boolean isValid = 0 <= num1 && num1 <= 100 && 0 <= num2 && num2 <= 100;
            int answer = 0;
            if (isValid) {
                answer = num1 / num2;
            }
            return answer;
        }
    }
}
