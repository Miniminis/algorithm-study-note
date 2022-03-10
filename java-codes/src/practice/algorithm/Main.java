package practice.algorithm;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("solution(new int[]{93, 30, 55}, new int[]{1, 30, 5}) = "
                + Arrays.toString(
                        solution(new int[]{93, 30, 55},
                                new int[]{1, 30, 5})));
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int[100];
        int day = 1;

        for (int i=0; i < progresses.length; i++) {
            while (progresses[i] + (speeds[i] * day) < 100) {
                day ++;
            }
            answer[day]++;
        }

        return Arrays.stream(answer).filter(i -> i != 0).toArray();
    }

}
