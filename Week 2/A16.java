public class AdditionAndSquareRoot {
    
    // Simple function addition
    public static int addSimple(int a, int b) {
        return a + b;
    }

    // Addition using loop
    public static int addUsingLoop(int a, int b) {
        int sum = a;
        for (int i = 0; i < b; i++) {
            sum++;
        }
        return sum;
    }

    // Addition using recursion
    public static int addUsingRecursion(int a, int b) {
        if (b == 0) {
            return a;
        }
        return addUsingRecursion(a + 1, b - 1);
    }

    // Addition using bitwise operators
    public static int addUsingBitwise(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    //Addition using switch case
    public static int addUsingSwitch(int a, int b) {
        switch (b) {
            case 0: return a;
            default: return addUsingSwitch(a + 1, b - 1);
        }
    }

    //Finding square root without using Math.sqrt()
    public static double findSquareRoot(double num) {
        double guess = num;
        double epsilon = 0.00001; // Precision level

        while (Math.abs(guess * guess - num) > epsilon) {
            guess = (guess + num / guess) / 2;
        }

        return guess;
    }

    public static void main(String[] args) {
        int a = 10, b = 15;

        System.out.println("Addition using Simple Method: " + addSimple(a, b));
        System.out.println("Addition using Loop: " + addUsingLoop(a, b));
        System.out.println("Addition using Recursion: " + addUsingRecursion(a, b));
        System.out.println("Addition using Bitwise Operators: " + addUsingBitwise(a, b));
        System.out.println("Addition using Switch Case: " + addUsingSwitch(a, b));

        double number = 49;
        System.out.println("Square root of " + number + " is: " + findSquareRoot(number));
    }
}

