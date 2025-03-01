
import java.util.Scanner;

public class A5 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the length of the rectangle: ");
	        double length = sc.nextDouble();

	        System.out.print("Enter the width of the rectangle: ");
	        double width = sc.nextDouble();

	        // Calculate the area
	        double area = length * width;

	     
	        System.out.println("\nThe area of the rectangle is: " + area);

	        sc.close();
	    }
	}


