package practice.algorithm.programmers;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120811
 * 중앙값구하기
 * */
public class P120811 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int solution(int[] array) {
            Arrays.sort(array);

            int arrLength = array.length;
            int idxMid = arrLength / 2;

            return array[idxMid];
        }
    }

    /**
     * 시프트 연산으로 나누기 2를 처리하였다.
     * */
    static class Solution2 {
        public int solution(int[] array) {
            Arrays.sort(array);
            return array[array.length >> 1];
        }
    }

    /**
     * 나와 비슷하지만 불필요한 변수를 쓰지 않았다.
     * */
    static class Solution3 {
        public int solution(int[] array) {
            Arrays.sort(array);

            return array[array.length / 2];
        }
    }

}
