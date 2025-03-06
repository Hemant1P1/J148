public class StringImmutableExample {
    public static void main(String[] args) {
        
        String original = "Hello";
        String modified = original.concat(" World");
        System.out.println("Original String: " + original);
        System.out.println("Modified String: " + modified);
        
        if (original.equals("Hello")) {
            System.out.println("Strings are immutable in Java.");
        } else {
            System.out.println("Strings are mutable.");
        }
    }
}
