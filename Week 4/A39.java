
import java.util.*;

class Employee {
    String name;
    int id;
    double salary;
    
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", id=" + id + ", salary=" + salary + '}';
    }
}

public class EvenNumbersFinder {
    public static void main(String[] args) {
        // Example list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Find even numbers using Java Streams
        List<Integer> evenNumbers = findEvenNumbers(numbers);
        
        // Print the even numbers
        System.out.println("Even numbers: " + evenNumbers);
        
        // Creating an array of Employee objects
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Alice", 101, 50000);
        employees[1] = new Employee("Bob", 102, 60000);
        employees[2] = new Employee("Charlie", 103, 70000);
        
        // Printing Employee details
        System.out.println("Employee Details:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
    
    public static List<Integer> findEvenNumbers(List<Integer> numbers) {
        // Using Stream API to filter even numbers
        return numbers.stream()
                      .filter(n -> n % 2 == 0)
                      .toList(); // Collecting the results as a list
    }
}
