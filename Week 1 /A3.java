
import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        // Input base and exponent
		        System.out.print("Enter the base number: ");
		        double base = sc.nextDouble();

		        System.out.print("Enter the exponent: ");
		        int exponent = sc.nextInt();

		        // Calculate power using Math.pow()
		        double result = Math.pow(base, exponent);

		        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

		        sc.close();
		    }
		

	}


