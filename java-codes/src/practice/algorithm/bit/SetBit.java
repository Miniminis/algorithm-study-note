package practice.algorithm.bit;

public class SetBit {

    static int setBit(int num, int idx) {
        return num | (1 << idx);
    }

    public static void main(String[] args) {
        //1 0 0 1 -> 9 (same)
        System.out.println(setBit(9, 3));
        // 0 1 0 1 -> 13 (changed)
        System.out.println(setBit(5, 3));
    }
}
