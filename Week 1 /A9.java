
import java.util.Scanner;

public class A9 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        int num1 = sc.nextInt();

	        System.out.print("Enter the second number: ");
	        int num2 = sc.nextInt();

	        System.out.println("\nBefore Swapping:");
	        System.out.println("First number: " + num1);
	        System.out.println("Second number: " + num2);

	        // Swapping without using a third variable
	        num1 = num1 + num2;
	        num2 = num1 - num2;
	        num1 = num1 - num2;

	        System.out.println("\nAfter Swapping:");
	        System.out.println("First number: " + num1);
	        System.out.println("Second number: " + num2);

	        sc.close();
	    }
	}



