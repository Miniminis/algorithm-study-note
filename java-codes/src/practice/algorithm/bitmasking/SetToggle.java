package practice.algorithm.bitmasking;

/**
 * 1이면 0, 0이면 1로 변환
 * */
public class SetToggle {
    public static void main(String[] args) {
        int a = 7;  //111
        //목표 : 101 = 5
        System.out.println(a ^ 1 << 1);
    }
}
