package practice.algorithm.programmers;

public class P120837 {
    public static void main(String[] args) {

    }

    class Solution {
        public int solution(int hp) {
            int[] ants = {5, 3, 1};
            int answer = 0;

            for (int i = 0; i < ants.length; i++) {
                answer += hp / ants[i];
                hp = hp % ants[i];
            }

            return answer;
        }
    }

    class Solution2 {
        public int solution(int hp) {
            return hp / 5 + hp % 5 / 3 + hp % 5 % 3;
        }
    }
}
