package practice.algorithm.programmers;

import java.util.stream.IntStream;

/**
 * 순서쌍의 개수
 * */
public class P120836 {
    public static void main(String[] args) {

    }

    class Solution {
        public int solution(int n) {

            return (int) IntStream.rangeClosed(1, n)
                    .filter(i -> n % i == 0)
                    .count();
        }
    }

    class Solution2 {
        public int solution(int n) {
            int answer = 0;

            for (int i = 1; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    answer++;
                }
            }

            answer = answer * 2;

            if (n % Math.sqrt(n) == 0) {
                answer++;
            }

            return answer;
        }
    }
}
