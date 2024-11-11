package ie.atu.streamlab;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java Streams!");

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        integers.stream()
             .filter(integer -> integer.intValue() % 2 == 1)
             .forEach(integer -> System.out.println(integer));
    }
}