package practice.algorithm.programmers;

import java.util.Arrays;
import java.util.stream.Collectors;

public class P120839 {
    public static void main(String[] args) {

    }

    class Solution {
        public String solution(String rsp) {
            char[] chars = rsp.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '2') {
                    chars[i] = '0';
                } else if (chars[i] == '0') {
                    chars[i] = '5';
                } else {
                    chars[i] = '2';
                }
            }

            return String.valueOf(chars);
        }
    }


    class Solution2 {
        public String solution(String rsp) {
        /*
        2 -> 0
        0 -> 5
        5 -> 2
        */
            return Arrays.stream(rsp.split("")).map(s -> s.equals("2") ? "0" : s.equals("0") ? "5" : "2").collect(Collectors.joining());
        }
    }
}
