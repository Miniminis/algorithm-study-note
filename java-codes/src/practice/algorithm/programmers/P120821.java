package practice.algorithm.programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 배열 뒤집기
 * */
public class P120821 {
    public static void main(String[] args) {

    }

    class Solution {
        public int[] solution(int[] num_list) {
            int length = num_list.length;
            int[] answer = new int[length];

            IntStream.range(0, length).forEach(i -> {
                answer[i] = num_list[length-1-i];
            });

            return answer;
        }
    }

    class Solution2 {
        public int[] solution(int[] numList) {
            List<Integer> integers = Arrays.stream(numList).boxed().collect(Collectors.toList());
            Collections.reverse(integers);

            return integers.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}
