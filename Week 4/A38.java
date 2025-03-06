import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
     
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();
        
        int vowels = 0, consonants = 0;
        
        String vowelsSet = "aeiou";
        
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) { // Check if it's a letter
                if (vowelsSet.indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        
       
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        
        scanner.close();
    }
}
