package practice.algorithm.stackqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * stack 직접 구현하기
 * 19428 kb  / 404 ms
 * ArrayList 이용
 * - remove(n) 사용시에는 값이 아니라 인덱스를 넣어야 한다.
 * */
public class Bj10828_1 {
    private static List<Integer> stack = new ArrayList<>();

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
        stack.add(n);
    }

    public static int pop() {
        if (empty() != 1) {
            int lastIdx = size() - 1;
            Integer num = stack.get(lastIdx);
            stack.remove(lastIdx);
            return num;
        }
        return -1;
    }

    public static int size() {
        return stack.size();
    }

    public static int empty() {
        return stack.isEmpty() ? 1 : 0;
    }

    public static int top() {
        if (empty() != 1) {
            return stack.get(size()-1);
        }
        return -1;
    }
}
