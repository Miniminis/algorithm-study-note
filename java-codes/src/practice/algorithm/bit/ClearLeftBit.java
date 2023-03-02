package practice.algorithm.bit;

public class ClearLeftBit {

    static int clearLeftBits(int num, int idx)  {
        return num & ((1 << idx) -1);
    }

    public static void main(String[] args) {
        //1
        System.out.println(clearLeftBits(169, 3));
    }
}
