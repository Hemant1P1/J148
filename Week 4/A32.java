public class ReplaceDigits {
    public static void main(String[] args) {
        String input = "Hello123World456";
        char replacementChar = '*'; 
        String output = input.replaceAll("\\d", String.valueOf(replacementChar));
        System.out.println("Original String: " + input);
        System.out.println("Modified String: " + output);
    }
}

