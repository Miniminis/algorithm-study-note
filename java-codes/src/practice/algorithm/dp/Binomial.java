package practice.algorithm.dp;

public class Binomial {
    public static void main(String[] args) {
        int n = 6;
        int k = 3;

        System.out.println(bionomial(n, k));
    }

    private static int bionomial(int n, int k) {
        if (n == k || k == 0) {
            return 1;
        }

        return bionomial(n-1, k-1) + bionomial(n-1, k);
    }
}
