public class ReplaceDigits {
    public static void main(String[] args) {
        String input = "Hello123World456";
        char replacementChar = '*'; // Character to replace digits with
        
        // Replace all digits with the specified character
        String output = input.replaceAll("\\d", String.valueOf(replacementChar));
        
        System.out.println("Original String: " + input);
        System.out.println("Modified String: " + output);
    }
}

