package practice.algorithm.java;

public class StringSplitTest {
    public static void main(String[] args) {
        String order = "push 1";
        String[] s = order.split(" ");
        System.out.println("s[0] = " + s[0]);
        System.out.println("s[1] = " + s[1]);

        order = "top";
        String[] s1 = order.split(" ");
        System.out.println("s1[0] = " + s1[0]);
        System.out.println("s1[1] = " + s1[1]);
    }
}
