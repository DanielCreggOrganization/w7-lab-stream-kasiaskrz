package ie.atu.streamlab;
import java.util.Arrays;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
        
        // multiply using reduce
        int product = numbers.stream()
                        .reduce(1, (a, b) -> a * b);
        System.out.println("Product: " + product);  

        // Example 2: Find minimum number
        int min = numbers.stream()
                        .reduce(Integer.MAX_VALUE, Integer::min);
        System.out.println("Min value: " + min);  

        // Example 3: Concatenate strings
        List<String> words = Arrays.asList("Hello", " ", "World", "!");
        String combined = words.stream()
                             .reduce("", (a, b) -> a + b);
        System.out.println("Combined string: " + combined);  // Output: Hello World!
    }
}