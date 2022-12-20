package practice.algorithm.stackqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 큐 구현문제
 * 20620 kb / 364 ms
 * ArrayList 사용
 * - remove(n) 사용시, 값이 아니라 인덱스를 넣어야 한다.
 * */
public class Bj10845_1 {
    private static List<Integer> queue = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String[] orders = br.readLine().split(" ");
            run(orders);
        }
    }

    private static void run(String[] orders) {
        switch (orders[0]) {
            case "push" : push(Integer.parseInt(orders[1])); break;
            case "pop" : System.out.println(pop()); break;
            case "size" : System.out.println(size()); break;
            case "empty" : System.out.println(empty()); break;
            case "front" : System.out.println(front()); break;
            case "back" : System.out.println(back()); break;
        }
    }

    private static int back() {
        if (empty() != 1) {
            return queue.get(size()-1);
        }
        return -1;
    }

    private static int front() {
        if (empty() != 1) {
            return queue.get(0);
        }
        return -1;
    }

    private static int pop() {
        if (empty() != 1) {
            int firstIdx = 0;
            int front = queue.get(firstIdx);
            queue.remove(firstIdx);
            return front;
        }

        return -1;
    }

    private static int empty() {
        return queue.isEmpty() ? 1 : 0;
    }

    private static int size() {
        return queue.size();
    }

    private static void push(int n) {
        queue.add(n);
    }


}
