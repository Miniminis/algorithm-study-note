package practice.algorithm.math;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Bj4948 {
    public static void main(String[] args) {
        //베르트랑 공준
        // n < 소수가 적어도 하나 존재! <= 2n

        Scanner sc = new Scanner(System.in);

        List<Integer> inputs = new ArrayList<>();
        while (sc.hasNextInt()) {
            int input = sc.nextInt();
            if (input == 0) break;
            inputs.add(input);
        }

        inputs.sort(Comparator.naturalOrder());

        int max = inputs.get(inputs.size()-1) * 2;

        boolean[] isPrime = new boolean[max+1];
        //true : 소수아님, false : 소수
        isPrime[0] = isPrime[1] = true;

        for (int i = 2; i*i <= max; i++) {
            if (!isPrime[i]) {
                for (int j = i*i; j <= max; j += i) {
                    isPrime[j] = true;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i : inputs) {
            int count = 0;
            for (int j = i+1; j <= 2*i; j++) {
                if (!isPrime[j]) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }
}
