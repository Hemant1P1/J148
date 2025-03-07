import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        
        return Arrays.equals(sArray, tArray);
    }

    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";
        
        System.out.println("Are '" + s + "' and '" + t + "' anagrams? " + isAnagram(s, t));
    }
}

