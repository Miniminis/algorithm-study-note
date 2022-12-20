package practice.algorithm.stackqueue;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("h");
        stack.push("e");
        stack.push("l");
        stack.push("l");
        stack.push("o");
        System.out.println("stack = " + stack);

        System.out.println("stack.empty() = " + stack.empty());

        System.out.println("stack.peek() = " + stack.peek());
        System.out.println("stack = " + stack);

        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack = " + stack);

        while(!stack.empty()) {
            System.out.println("stack.pop() = " + stack.pop());
        }
        System.out.println("stack = " + stack);
        System.out.println("stack.isEmpty() = " + stack.isEmpty());
    }
}
