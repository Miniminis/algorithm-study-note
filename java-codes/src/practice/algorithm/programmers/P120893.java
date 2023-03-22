package practice.algorithm.programmers;

import java.util.stream.Collectors;

public class P120893 {
    public static void main(String[] args) {
        String hello = "hello";
        String s = hello.chars()
                .mapToObj(i -> String.valueOf((char) (Character.isUpperCase(i) ? Character.toLowerCase(i) : Character.toUpperCase(i)))).collect(Collectors.joining());
        System.out.println(s);
    }

    class Solution2 {
        public String solution(String myString) {
            return myString.chars()
                    .mapToObj(i -> String.valueOf((char) (Character.isUpperCase(i) ? Character.toLowerCase(i) : Character.toUpperCase(i)))).collect(Collectors.joining());
        }
    }

}
