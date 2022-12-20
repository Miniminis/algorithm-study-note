package practice.algorithm.stackqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * stack 직접 구현하기
 * 19920 kb / 356 ms
 * 배열 활용
 * */
public class Bj10828_2 {
    private static int topIdx = -1;
    private static int[] stack;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalNum = Integer.parseInt(br.readLine());

        stack = new int[totalNum];

        for (int i = 0; i < totalNum; i++) {
            String order = br.readLine();
            String[] orders = order.split(" ");

            run(orders);
        }
    }

    private static void run(String[] orders) {
        switch (orders[0]) {
            case "push" : push(Integer.parseInt(orders[1])); break;
            case "pop" : System.out.println(pop()); break;
            case "size" : System.out.println(size()); break;
            case "empty" : System.out.println(empty()); break;
            case "top" : System.out.println(top()); break;
        }
    }

    public static void push(int n) {
        stack[++topIdx] = n;
    }

    public static int pop() {
        if (empty() != 1) {
            Integer num = stack[topIdx];
            topIdx--;
            return num;
        }
        return -1;
    }

    public static int size() {
        return topIdx+1;
    }

    public static int empty() {
        return topIdx < 0 ? 1 : 0;
    }

    public static int top() {
        if (empty() != 1) {
            return stack[topIdx];
        }
        return -1;
    }
}
