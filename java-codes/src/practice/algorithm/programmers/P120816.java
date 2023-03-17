package practice.algorithm.programmers;

/**
* https://school.programmers.co.kr/learn/challenges?order=acceptance_desc&page=1
 * 피자나눠먹기(1)
* */
public class P120816 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int solution(int slice, int n) {
            int answer = n / slice;
            if (n % slice != 0) {
                answer += 1;
            }
            return answer;
        }
    }

    static class Solution2 {
        public int solution(int slice, int n) {
            int answer = n / slice;
            return n % slice > 0 ? answer + 1 : answer;
        }
    }

}
