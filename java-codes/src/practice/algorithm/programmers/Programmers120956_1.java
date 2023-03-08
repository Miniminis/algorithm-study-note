package practice.algorithm.programmers;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120956
 * 옹알이 (1)
 * - programmers 에서 다른 사람의 풀이를 참고하여 다시 풀어보았다.
 * 나와 같은 점
 * - string 문자열의 replace 함수를 써서 일치하는 단어를 모두 "1" 로 바꾸어주었다.
 * 나와 다른 점
 * - contains() 를 쓰지 않고 일치하는 것이 있다면 바로 바꿔주도록 replace() 함수만 사용했다.
 * - 나는 일치하는 단어를 모두 바꾼 뒤, 한번 더 루프를 돌면서 0이외에 다른 값이 있다면 false 처리를 해주었는데,
 *      이분은 모든 값을 치환한 뒤, 마지막으로 1 마저 "" 값으로 치환하여, isEmpty() 함수를 사용하여
 *      보다 쉽게 문자열 판독을 할 수 있도록 하였다. 이해하기도 쉽고, 루프도 1회만 도니 더 효율적이다.
 * */
public class Programmers120956_1 {

    public static int solution(String[] babbling) {
        int answer = 0;

        for (int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replace("aya", "1");
            babbling[i] = babbling[i].replace("woo", "1");
            babbling[i] = babbling[i].replace("ye", "1");
            babbling[i] = babbling[i].replace("ma", "1");
            babbling[i] = babbling[i].replace("1", "");

            if (babbling[i].isEmpty()) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"}));
    }
}
