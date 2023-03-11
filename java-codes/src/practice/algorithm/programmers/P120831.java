package practice.algorithm.programmers;

import java.util.stream.IntStream;

public class P120831 {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(10));
        System.out.println(new Solution2().solution(10));
    }

    static class Solution {
        public int solution(int n) {
            int answer = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    answer += i;
                }
            }
            return answer;
        }
    }

    static class Solution2 {
        public int solution(int n) {
            return IntStream.rangeClosed(0, n).filter(i -> i % 2 == 0).sum();
        }
    }
}
