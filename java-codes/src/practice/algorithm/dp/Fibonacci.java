package practice.algorithm.dp;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(fib(n));
    }

    private static int fib(int n) {
        if (n <=2 ) {
            return 1;
        }

        return fib(n-1) + fib(n-2);
    }

}
