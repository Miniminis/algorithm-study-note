package practice.algorithm.bitmasking;

/**
 * 원소 삭제
 * - current 에서 p번 원소만 삭제
 * - p번 비트를 0으로 바꾸어주어야 한다.
 * */
public class SetRemove {
    public static void main(String[] args) {
        int p = 40;     //101000
        //3번째 원소를 제거하려면? 목표하는 수는 100000 = 32
        System.out.println(Integer.toBinaryString(1 << 3));
        System.out.println(p & ~(1 << 3));      //32
    }
}
