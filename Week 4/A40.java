import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input two binary strings
        System.out.print("Enter first binary string: ");
        String binary1 = scanner.next();
        System.out.print("Enter second binary string: ");
        String binary2 = scanner.next();
        
        // Perform binary addition
        String result = addBinary(binary1, binary2);
        
        // Display the result
        System.out.println("Resulting binary string: " + result);
        
        scanner.close();
    }

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            
            result.append(sum % 2); // Append binary sum
            carry = sum / 2; // Update carry
        }
        
        return result.reverse().toString(); // Reverse to get final binary string
    }
}

