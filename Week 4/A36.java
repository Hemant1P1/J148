import java.util.*;

public class UniqueCharacters {
    public static void main(String[] args) {
        
        String input = "hello world";
        Set<Character> uniqueChars = findUniqueCharacters(input);
        System.out.println("Unique characters: " + uniqueChars);
    }
    
    public static Set<Character> findUniqueCharacters(String input) {
        Set<Character> uniqueChars = new LinkedHashSet<>();
        
        for (char c : input.toCharArray()) {
            uniqueChars.add(c);
        }
        
        return uniqueChars;
    }
}

