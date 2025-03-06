import java.util.*;

public class ToggleStringCase {
    public static void main(String[] args) {
        // Example string
        String input = "javaLanguage";
        
        // Toggle the case of the string
        String toggledString = toggleCase(input);
        
        // Print the toggled string
        System.out.println("Toggled string: " + toggledString);
    }
    
    public static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(Character.toUpperCase(c));
            }
        }
        
        return result.toString();
    }
}

