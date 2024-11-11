package ie.atu.streamlab;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Hello, Java Streams!");

        List<String> fruits = Arrays.asList("apple", "banana", "grape", "kiwi", "orange", "mango");

        List<String> filteredFruits = fruits.stream()
                .filter(fruit -> fruit.length() > 4)
                .sorted()
                .map(fruit -> fruit.toUpperCase())
                .collect(Collectors.toList());
        filteredFruits.forEach(fruit -> System.out.println(fruit));
    }
}