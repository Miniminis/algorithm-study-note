package practice.algorithm.programmers;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;


/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120847
 * 최대값 만들기 1
 * */
public class P120847 {
    public static void main(String[] args) {

    }

    class Solution {
        public int solution(int[] numbers) {
            List<Integer> boxedNumbers = Arrays.stream(numbers).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());
            return boxedNumbers.get(0) * boxedNumbers.get(1);
        }
    }

    class Solution2 {
        public int solution(int[] numbers) {
            Arrays.sort(numbers);

            int lastIdx = numbers.length -1;
            return numbers[lastIdx] * numbers[lastIdx-1];
        }
    }

    class Solution3 {
        public int solution(int[] numbers) {
            numbers = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
            return numbers[0] * numbers[1];
        }
    }

}
