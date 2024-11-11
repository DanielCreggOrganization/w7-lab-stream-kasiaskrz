package ie.atu.streamlab;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Students {
    public static void main(String[] args) {
        String inputPath = "/workspaces/w7-lab-stream-kasiaskrz/src/ie/resources/input.txt";

        try (Stream<String> lines = Files.lines(Paths.get(inputPath))) {
            long count = lines.filter(line -> line.contains("Java")).count();
            System.out.println("Lines containing \"Java\": " + count); 

            double averageLength = Files.lines(Paths.get(inputPath))
                                        .mapToInt(String::length)
                                        .average()
                                        .orElse(0.0);

            System.out.println("Average line length: " + averageLength);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
