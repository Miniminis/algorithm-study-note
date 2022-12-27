package practice.algorithm.recursion;

public class BinaryNumber {
    public static void main(String[] args) {
        int num = 10;
        toBinaryNumber(num);
    }

    private static void toBinaryNumber(int num) {
        if (num < 2) {
            System.out.println(num);
            return;
        }

        toBinaryNumber(num / 2) ;
        System.out.println(num % 2);
    }

    /**
     * 1
     * 0
     * 1
     * 0
     * */
}
