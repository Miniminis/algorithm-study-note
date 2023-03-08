package practice.algorithm.programmers;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120956
 * 옹알이 (1)
 * */
public class Programmers120956 {
    private static int answer = 0;

    public static int solution(String[] babbling) {
        for (int i = 0; i < babbling.length; i++) {
            String word = babbling[i];
            countBabbling(word);
        }

        return answer;
    }

    public static void countBabbling(String word) {
        if (isPossible(word)) {
            answer++;
        }
    }

    public static boolean isPossible(String word) {
        String[] possibleWords = {"aya", "ye", "woo", "ma"};
        for (String possibleWord : possibleWords) {
            if (word.contains(possibleWord)) {
                word = word.replace(possibleWord, "0");
            }
        }

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != '0') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"}));
    }
}
