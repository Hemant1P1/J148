import java.util.*;

public class EvenNumbersFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (N): ");
        String number = scanner.next();
        System.out.print("Enter a digit to count (D): ");
        char digit = scanner.next().charAt(0);
        
        int count = countDigitOccurrences(number, digit);
        
        System.out.println("The total count of digit " + digit + " occurring in the number " + number + " is: " + count);
    }
    
    public static int countDigitOccurrences(String number, char digit) {
        int count = 0;
        for (char c : number.toCharArray()) {
            if (c == digit) {
                count++;
            }
        }
        return count;
    }
}

