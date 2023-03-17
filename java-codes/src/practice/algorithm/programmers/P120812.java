package practice.algorithm.programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120812
 * 최빈값구하기
 * */
public class P120812 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int solution(int[] array) {
            Map<Integer, Integer> count = new HashMap<>();

            for (int i = 0; i < array.length; i++) {
                count.put(array[i], count.getOrDefault(array[i], 0) + 1);
            }

            List<Map.Entry<Integer, Integer>> list = new ArrayList<>(count.entrySet());
            list.sort((o1, o2) -> count.get(o2.getKey()) - count.get(o1.getKey()));

            Map.Entry<Integer, Integer> max = list.get(0);

            if (list.size() < 2) {
                return max.getKey();
            }

            Map.Entry<Integer, Integer> nextMax = list.get(1);

            return max.getValue() > nextMax.getValue() ? max.getKey() : -1;
        }
    }
}
