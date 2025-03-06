import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        
        // Count occurrences of each character
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // Find the first unique character
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        return -1; // No unique character found
    }

    public static void main(String[] args) {
        String s = "leetcode";
        int index = firstUniqChar(s);
        if (index != -1) {
            System.out.println("First unique character is '" + s.charAt(index) + "' at index " + index);
        } else {
            System.out.println("No unique character found.");
        }
    }
}

