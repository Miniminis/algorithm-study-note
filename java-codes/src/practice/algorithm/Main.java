package practice.algorithm;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long numOfCow = sc.nextInt();

        Stack<Long> cowsHigherThanMe = new Stack();
        long count = 0;

        for (long i = 0; i < numOfCow; i++) {
            long cow = sc.nextInt();

            if (cowsHigherThanMe.isEmpty()) {
                cowsHigherThanMe.push(cow);
            } else if (cow >= cowsHigherThanMe.peek()) {
                //나보다 키가 같거나 작은소가 있을때까지 pop
                while (!cowsHigherThanMe.empty() && cow >= cowsHigherThanMe.peek()) {
                    cowsHigherThanMe.pop();
                }

                cowsHigherThanMe.push(cow);
            } else {
                //전부 나보다 키 큰 소들만 있음
                cowsHigherThanMe.push(cow);
            }

            count += (long) cowsHigherThanMe.size() - 1;
        }

        System.out.println(count);
    }
}
