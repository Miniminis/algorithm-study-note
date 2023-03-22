package practice.algorithm.programmers;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 짝수 홀수 개수
 * */
public class P120824 {
    public static void main(String[] args) {

    }

    class Solution {
        public int[] solution(int[] num_list) {
            int count = (int) Arrays.stream(num_list).filter(i -> i % 2 == 0).count();
            return new int[]{count, num_list.length - count};
        }
    }

    class Solution2 {
        public int[] solution(int[] num_list) {
            int[] answer = new int[2];
            for (int i = 0; i < num_list.length; i++) {
                answer[num_list[i] % 2]++;
            }
            return answer;
        }
    }

    class Solution3 {
        public int[] solution(int[] num_list) {
            return Arrays.stream(num_list)
                    .boxed()
                    .collect(Collectors.partitioningBy(number -> number % 2 == 1, Collectors.counting()))
                    .values().stream()
                    .mapToInt(Long::intValue)
                    .toArray();
        }
    }

}
