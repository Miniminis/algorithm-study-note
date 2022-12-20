package practice.algorithm.stackqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * stack 직접 구현하기
 * 20832 kb / 372 ms
 * Stack 자료형 활용
 * */
public class Bj10828_3 {
    private static final Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalNum = Integer.parseInt(br.readLine());

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
        stack.push(n);
    }

    public static int pop() {
        if (!stack.empty()) {
            return stack.pop();
        }
        return -1;
    }

    public static int size() {
        return stack.size();
    }

    public static int empty() {
        return stack.empty() ? 1 : 0;
    }

    public static int top() {
        if (!stack.isEmpty()) {
            return stack.peek();
        }
        return -1;
    }
}
