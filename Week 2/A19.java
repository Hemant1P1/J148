import java.util.Scanner;

public class PatternDemo {

    // Recursive function to print a triangle pattern
    static void printTriangle(int rows, int current) {
        if (current > rows) return; // Base condition
        for (int i = 0; i < current; i++) {
            System.out.print("* ");
        }
        System.out.println();
        printTriangle(rows, current + 1); // Recursive call
    }

    // Function to print a square pattern using loops
    static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Function to print a pyramid pattern using loops
    static void printPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" "); // Print leading spaces
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*"); // Print stars
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose a pattern to print:");
        System.out.println("1. Triangle (Recursive)");
        System.out.println("2. Square (Loop)");
        System.out.println("3. Pyramid (Loop)");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter number of rows: ");
                int triangleRows = scanner.nextInt();
                printTriangle(triangleRows, 1);
                break;
            case 2:
                System.out.print("Enter size of square: ");
                int squareSize = scanner.nextInt();
                printSquare(squareSize);
                break;
            case 3:
                System.out.print("Enter number of rows: ");
                int pyramidRows = scanner.nextInt();
                printPyramid(pyramidRows);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}

