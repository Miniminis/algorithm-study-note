package practice.algorithm.programmers;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 문자열뒤집기
 * */
public class P120822 {
    public static void main(String[] args) {
        System.out.println(new Solution2().solution("hello"));
    }

    class Solution {
        public String solution(String my_string) {
            StringBuilder sb = new StringBuilder();
            for (int i = my_string.length() - 1; i >= 0; i--) {
                sb.append(my_string.charAt(i));
            }
            return sb.toString();
        }
    }

    static class Solution2 {
        public String solution(String my_string) {
            StringBuilder sb = new StringBuilder(my_string);
            sb.reverse();
            return sb.toString();
        }
    }

}
