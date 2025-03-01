public class Addition {
    public static void main(String[] args) {
        // Adding two numbers
        int num1 = 10, num2 = 20;
        System.out.println("Sum of numbers: " + (num1 + num2));

        // Adding two binary numbers
        int bin1 = 0b1010, bin2 = 0b1100;
        System.out.println("Sum of binary numbers: " + Integer.toBinaryString(bin1 + bin2));

        // Adding two characters
        char ch1 = 'A', ch2 = 'B';
        System.out.println("Sum of characters (ASCII values): " + (ch1 + ch2));
    }
}
