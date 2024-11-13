package ie.atu.src.students;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

class Student {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getGpa() { return gpa; }
}

public class StreamExercise1 {
    public static void main(String[] args) {
        // 1. Create ArrayList of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22, 3.8));
        students.add(new Student("Bob", 19, 3.5));
        students.add(new Student("Charlie", 21, 3.9));
        students.add(new Student("Diana", 20, 3.7));
        students.add(new Student("Kate", 22, 2.7));
        students.add(new Student("John", 18, 3.9));
        students.add(new Student("Max", 20, 2.9));


        // 2. Convert to stream, filter, sort, map, and print
        students.stream()                          // Convert ArrayList to Stream
               .filter(s -> s.getGpa() > 3.7)       
               .sorted(Comparator.comparing(Student::getGpa).reversed())  // Sort by GPA descending
               .map(s -> String.format("Name: %-10s GPA: %.2f", s.getName(), s.getGpa()))  // Format student info
               .forEach(System.out::println);      // Print each formatted string
        
        System.out.println("\n"); // Line break

        students.stream()
        .filter(s -> s.getAge() < 20)
        .map(s -> String.format("Second map operation: Name: %-10s Age: %d", s.getName(), s.getAge()))  // Format student info
        .forEach(System.out::println);

            }
}
