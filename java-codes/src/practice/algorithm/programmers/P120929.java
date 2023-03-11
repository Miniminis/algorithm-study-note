package practice.algorithm.programmers;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120829
 * 각도기
 * 나의 풀이
 * - if - else if 문을 써서 구현하였다.
 * 다른 풀이
 * - 삼항연산자를 이용하여 한 줄로 구현하였다.
 * */
public class P120929 {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(90));
        System.out.println(new Solution2().solution(90));
    }

    static class Solution {
        public int solution(int angle) {
            return getAngleLevel(angle);
        }

        public int getAngleLevel(int angle) {
            if (angle == 180) {
                return 4;
            } else if (90 < angle && angle < 180) {
                return 3;
            } else if (angle == 90) {
                return 2;
            } else if (0 < angle && angle < 90) {
                return 1;
            }
            return -1;
        }
    }

    static class Solution2 {
        public int solution(int angle) {
            return angle == 180 ? 4 : angle > 90 ? 3 : angle == 90 ? 2 : 1;
        }
    }
}
