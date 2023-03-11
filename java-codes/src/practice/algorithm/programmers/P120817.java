package practice.algorithm.programmers;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120817
 * 배열의 평균값
 * */
public class P120817 {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99}));
    }

    static class Solution {
        public double solution(int[] numbers) {
//            return Arrays.stream(numbers).average().getAsDouble();
            return Arrays.stream(numbers).average().orElse(0);
        }
    }
}
