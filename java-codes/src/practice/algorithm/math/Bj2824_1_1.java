package practice.algorithm.math;

import java.math.BigInteger;
import java.util.Scanner;

public class Bj2824_1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        BigInteger a = new BigInteger("1");
        while ( n > 0 ) {
            a = BigInteger.valueOf(sc.nextInt()).multiply(a);
            n--;
        }

        int m = sc.nextInt();
        BigInteger b = new BigInteger("1");
        while (m > 0) {
            b = BigInteger.valueOf(sc.nextInt()).multiply(b);
            m--;
        }

        if (a.compareTo(b) < 0) {
            BigInteger temp = new BigInteger("0");
            temp = a;
            a = b;
            b = temp;
        }

        String strGcd = a.gcd(b).toString();
        System.out.println(strGcd.length() > 9 ? strGcd.substring(strGcd.length()-9, strGcd.length()) : strGcd);
    }
}
