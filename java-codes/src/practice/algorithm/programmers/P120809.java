package practice.algorithm.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120809
 * 배열 두배 만들기
 * - for 문 돌면서 그대로 새로운 배열 값에 삽입
 * 다른 풀이 방법
 * 1. stream 사용
 * 2. 향상된 for문
 * */
public class P120809 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(new int[]{1, 2, 3, -100, 5})));
        System.out.println(Arrays.toString(new Solution2().solution(new int[]{1, 2, 3, -100, 5})));
        System.out.println(Arrays.toString(new Solution3().solution(new int[]{1, 2, 3, -100, 5})));
    }

    static class Solution {
        public int[] solution(int[] numbers) {
            int[] answer = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                answer[i] = numbers[i] * 2;
            }
            return answer;
        }
    }

    static class Solution2 {
        public int[] solution(int[] numbers) {
            return Arrays.stream(numbers).map(n -> n * 2).toArray();
        }
    }

    static class Solution3 {
        public int[] solution(int[] numbers) {
            List<Integer> answer = new ArrayList<>();
            for (int n : numbers) {
                answer.add(n*2);
            }
            return answer.stream().mapToInt(i -> i).toArray();
        }
    }
}
