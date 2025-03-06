public class ModulusWithoutOperator {
    public static int findMod(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Divisor cannot be zero");
        }
        
        int quotient = dividend / divisor; // Get the integer division result
        int remainder = dividend - (quotient * divisor); // Compute the remainder
        
        return remainder;
    }

    public static void main(String[] args) {
        int dividend = 17;
        int divisor = 5;

        int result = findMod(dividend, divisor);
        System.out.println("Remainder of " + dividend + " / " + divisor + " = " + result);
    }
}

