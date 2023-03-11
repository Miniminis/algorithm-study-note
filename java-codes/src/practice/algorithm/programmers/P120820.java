package practice.algorithm.programmers;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120820
 * 나이 출력
 *
 * */
public class P120820 {
    public static void main(String[] args) {

    }

    static class Solution {
        private static final int BASE_YEAR = 2022;

        public int solution(int age) {
            return BASE_YEAR - age + 1;
        }
    }
}
