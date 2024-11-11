package ie.atu.streamlab;
import java.util.Arrays;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using lambda
        numbers.stream()
            .map(NumberUtils::doubleNumber)
             .forEach(System.out::println);

    }

    class NumberUtils {
        public static int doubleNumber(int num) {
            return num * 2;
        }
    
}
}
