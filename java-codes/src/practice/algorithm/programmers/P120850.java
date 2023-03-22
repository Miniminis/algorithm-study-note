package practice.algorithm.programmers;

import java.util.Arrays;

public class P120850 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int[] solution(String my_string) {
            return my_string.chars()
                    .map(i -> (char) i)
                    .filter(Character::isDigit)
                    .map(Character::getNumericValue)
                    .sorted()
                    .toArray();
        }
    }

    static class Solution2 {
        public int[] solution(String my_string) {
            return Arrays
                    .stream(my_string.replaceAll("[A-Z|a-z]", "").split(""))
                    .mapToInt(Integer::parseInt)
                    .sorted()
                    .toArray();
        }
    }
}
