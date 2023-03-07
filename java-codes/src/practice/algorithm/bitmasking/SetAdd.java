package practice.algorithm.bitmasking;

/**
 * 집합에 원소 추가
 * - 현재상태인 cur 이 존재할 때, p번 원소를 추가한다고 가정.
 * - cur 에서 p번째 비트만 1로 바꾸어주어야 한다.
 * -
 * */
public class SetAdd {
    public static void main(String[] args) {
        int b = 16;     //10000
        //목표 : 11010 = 26
        System.out.println(b | 1 << 3 | 1 << 1);

        int a = 32;     //100000
        //뒤에서 4번째 index에 원소를 추가하고자 할때, 만들려는 수는 101000

        System.out.println(Integer.toBinaryString(1 << 3));
        System.out.println(a | (1 << 3));       //40
    }
}
