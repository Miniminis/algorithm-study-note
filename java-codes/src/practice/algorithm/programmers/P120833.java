package practice.algorithm.programmers;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 배열자르기
 * */
public class P120833 {
    public static void main(String[] args) {

    }

    class Solution {
        public int[] solution(int[] numbers, int num1, int num2) {
            return IntStream.rangeClosed(num1, num2).map(i -> numbers[i]).toArray();
        }
    }

    class Solution2 {
        public int[] solution(int[] numbers, int num1, int num2) {
            return Arrays.copyOfRange(numbers, num1, num2+1);
        }
    }
}
