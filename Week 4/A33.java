import java.util.*;

public class EvenNumbersFinder {
    public static void main(String[] args) {
        // Example list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Find even numbers using Java Streams
        List<Integer> evenNumbers = findEvenNumbers(numbers);
        
        // Print the even numbers
        System.out.println("Even numbers: " + evenNumbers);
    }
    
    public static List<Integer> findEvenNumbers(List<Integer> numbers) {
        // Using Stream API to filter even numbers
        return numbers.stream()
                      .filter(n -> n % 2 == 0)
                      .toList(); // Collecting the results as a list
    }
}

