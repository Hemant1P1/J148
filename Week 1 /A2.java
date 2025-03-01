
package Assignment;

import java.util.Scanner;

public class A2 {

	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter the principal amount: ");
	        double principal = sc.nextDouble();

	        System.out.print("Enter the rate of interest (in %): ");
	        double rate = sc.nextDouble();

	        System.out.print("Enter the time (in years): ");
	        double time = sc.nextDouble();

	        System.out.print("Enter the number of times interest is compounded per year: ");
	        int n = sc.nextInt();

	        // Compound Interest formula: A = P * (1 + r/n)^(nt)
	        double amount = principal * Math.pow((1 + rate / 100 / n), n * time);
	        double compoundInterest = amount - principal;

	      
	        System.out.println("\nCompound Interest: " + compoundInterest);
	        System.out.println("Total Amount: " + amount);

	        sc.close();
	    }
	}



