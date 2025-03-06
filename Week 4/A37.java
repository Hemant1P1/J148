public class StringImmutableExample {
    public static void main(String[] args) {
        // Creating a String object
        String original = "Hello";
        
        // Trying to modify the string
        String modified = original.concat(" World");
        
        // Printing both strings
        System.out.println("Original String: " + original);
        System.out.println("Modified String: " + modified);
        
        // Checking if the original string is changed
        if (original.equals("Hello")) {
            System.out.println("Strings are immutable in Java.");
        } else {
            System.out.println("Strings are mutable.");
        }
    }
}
