import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        int[] ints = Arrays.stream(new String[]{}).mapToInt(String::length).toArray();

        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] newArr = new int[arr.length];

        String str = "hello123";

        str.chars()
                .map(i -> (char) i)
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .forEach(System.out::println);

        List<String> numbers = IntStream.range(1, 10)
                .mapToObj(String::valueOf)
                .collect(Collectors.toList());


        System.out.println(Math.sqrt(144));

        System.out.println(Character.isUpperCase('c'));
        System.out.println(Character.toLowerCase('C'));
        System.out.println(Character.getNumericValue('Z'));

        str.chars().map(i -> (char) i).filter(Character::isDigit).mapToObj(String::valueOf).mapToInt(Integer::parseInt).sorted().toArray();
        int[] arrs = str.chars().map(i -> (char) i).filter(Character::isDigit).sorted().toArray();
    }
}
