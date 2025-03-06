import java.util.Scanner;

public class FactorialCalculator {
    
    public static long factorialIterative(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static long factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        
        System.out.println("Factorial (Iterative): " + factorialIterative(num));
        System.out.println("Factorial (Recursive): " + factorialRecursive(num));
    }
}

