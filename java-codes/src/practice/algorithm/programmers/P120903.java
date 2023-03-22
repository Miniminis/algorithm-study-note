package practice.algorithm.programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 배열의 유사도
 * */
public class P120903 {
    public static void main(String[] args) {

    }

    class Solution {
        public int solution(String[] s1, String[] s2) {
            int answer = 0;
            for (int i = 0; i < s1.length; i++) {
                for (int j = 0; j < s2.length; j++) {
                    if (s1[i].equals(s2[j])) {
                        answer++;
                    }
                }
            }
            return answer;
        }
    }

    class Solution2 {
        public int solution(String[] s1, String[] s2) {
            Set<String> set = new HashSet<>(Arrays.asList(s1));
            return (int) Arrays.stream(s2).filter(set::contains).count();
        }
    }

    class Solution3 {
        public int solution(String[] s1, String[] s2) {
            List<String> s2List = Arrays.stream(s2).collect(Collectors.toList());
            return (int) Arrays.stream(s1).filter(s2List::contains).count();
        }
    }
}
