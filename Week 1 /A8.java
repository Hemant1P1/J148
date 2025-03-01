
import java.util.Scanner;

public class A8 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the upper limit (n) to display prime numbers from 1 to n: ");
	        int n = sc.nextInt();

	        System.out.println("Prime numbers between 1 and " + n + " are:");

	        for (int i = 2; i <= n; i++) {
	            if (isPrime(i)) {
	                System.out.print(i + " ");
	            }
	        }
	        sc.close();
	    }

	    // Method to check if a number is prime
	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}




