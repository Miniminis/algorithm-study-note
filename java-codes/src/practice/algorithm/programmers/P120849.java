package practice.algorithm.programmers;

import java.util.Arrays;
import java.util.List;

/**
 * 모음제거
 * */
public class P120849 {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("hello"));
    }

    static class Solution {
        public String solution(String my_string) {
            List<String> removeCandidates = List.of("a", "e", "i", "o", "u");
            StringBuilder sb = new StringBuilder();

            Arrays.stream(my_string.split(""))
                    .filter(s -> !removeCandidates.contains(s))
                    .forEach(sb::append);
            return sb.toString();
        }
    }

    class Solution2 {
        public String solution(String my_string) {
            return my_string.replaceAll("[aeiou]", "");
        }
    }
}
