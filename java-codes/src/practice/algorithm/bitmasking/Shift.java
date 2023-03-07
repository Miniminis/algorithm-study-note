package practice.algorithm.bitmasking;

public class Shift {
    public static void main(String[] args) {
        System.out.println(9 << 2);
        //1001 -> 0010 0100 = 4+32 = 36

        System.out.println(Integer.toBinaryString(15));
        System.out.println(15 << 3);
        //1111 -> 0111 1000 = 8+16+32+64 = 24+96 = 120

        System.out.println(4 >> 2);
        //100 -> 001 = 1

        System.out.println(1 << 2);
        //001 -> 100 = 4
    }
}
