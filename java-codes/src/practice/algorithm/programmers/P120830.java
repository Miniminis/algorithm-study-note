package practice.algorithm.programmers;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120830
 * 양꼬치
 * */
public class P120830 {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(10, 3));
    }

    static class Solution {
        private final int YANG_PRICE = 12000;
        private final int DRINK_PRICE = 2000;

        public int solution(int n, int k) {
            int answer = n * YANG_PRICE + k * DRINK_PRICE;

            if (n >= 10) {
                answer -= n / 10 * DRINK_PRICE;
            }

            return answer;
        }
    }

    static class Solution2 {
        private final int YANG_PRICE = 12000;
        private final int DRINK_PRICE = 2000;

        public int solution(int n, int k) {
            return n * YANG_PRICE + k * DRINK_PRICE - n / 10 * DRINK_PRICE;
        }
    }
}
