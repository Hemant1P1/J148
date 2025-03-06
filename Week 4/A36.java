import java.util.*;

public class UniqueCharacters {
    public static void main(String[] args) {
        // Example string
        String input = "hello world";
        
        // Find unique characters
        Set<Character> uniqueChars = findUniqueCharacters(input);
        
        // Print the unique characters
        System.out.println("Unique characters: " + uniqueChars);
    }
    
    public static Set<Character> findUniqueCharacters(String input) {
        Set<Character> uniqueChars = new LinkedHashSet<>();
        
        // Iterate over the string and add characters to the set
        for (char c : input.toCharArray()) {
            uniqueChars.add(c);
        }
        
        return uniqueChars;
    }
}

