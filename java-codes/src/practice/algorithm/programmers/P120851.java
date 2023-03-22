package practice.algorithm.programmers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 숨어있는 숫자의 덧셈 1
 * */
public class P120851 {
    public static void main(String[] args) {

    }

    class Solution {
        public int solution(String my_string) {
            List<String> numbers = IntStream.range(1, 10).mapToObj(String::valueOf).collect(Collectors.toList());
            return Arrays.stream(my_string.split(""))
                    .filter(numbers::contains)
                    .mapToInt(Integer::parseInt)
                    .sum();
        }
    }

    class Solution2 {
        public int solution(String my_string) {
            return my_string.chars()
                    .mapToObj(i -> (char) i)
                    .filter(Character::isDigit)
                    .map(String::valueOf)
                    .mapToInt(Integer::parseInt)
                    .sum();
        }
    }
}
