package practice.algorithm.stackqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 큐 구현문제
 * 20464 kb / 360 ms
 * 배열 사용
 * */
public class Bj10845_2 {
    private static int frontIdx = 0;
    private static int backIdx = -1;
    private static int[] queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        queue = new int[num];

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
            return queue[backIdx];
        }
        return -1;
    }

    private static int front() {
        if (empty() != 1) {
            return queue[frontIdx];
        }
        return -1;
    }

    private static int pop() {
        if (empty() != 1) {
            int front = queue[frontIdx];
            frontIdx++;
            return front;
        }

        return -1;
    }

    private static int empty() {
        return size() <= 0 ? 1 : 0;
    }

    private static int size() {
        return (backIdx - frontIdx) + 1;
    }

    private static void push(int n) {
        queue[++backIdx] = n;
    }


}
