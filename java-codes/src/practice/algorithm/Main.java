package practice.algorithm;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] brackets = sc.next().split("");
        Stack<String> pair = new Stack<>();

        for (int i = 0; i < brackets.length; i++) {
            String bracket = brackets[i];

            if (pair.isEmpty()) {
                pair.push(bracket);
                continue;
            }

            if ((pair.peek() + bracket).equals("()")) {
                pair.pop();
            } else {
                pair.push(bracket);
            }
        }

        if (pair.isEmpty()) {
            System.out.println("good");
        } else {
            System.out.println("bad");
        }
    }
}
