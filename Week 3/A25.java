import java.util.Arrays;

public class AlphabeticalSort {
    public static void main(String[] args) {
        String[] words = {"Banana", "Apple", "Mango", "Cherry", "Grapes"};
        
        // Sorting the array
        Arrays.sort(words);
        
        // Displaying the sorted array
        System.out.println("Sorted Strings in Alphabetical Order:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

