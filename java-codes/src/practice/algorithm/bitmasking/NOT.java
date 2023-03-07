package practice.algorithm.bitmasking;

/**
 * 모든 비트에 NOT 연산을 한다.
 * */
public class NOT {
    public static void main(String[] args) {
        int a = 3;  //011

        System.out.println(~a); //100 = -4

        int b = 7;  //111 -> 0000 .... 00000111 = 7
        System.out.println(~b); //000 -> 1111.... 11111000 = -8
    }
}
