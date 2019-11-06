import java.util.Arrays;

public class Exercise6Anagrams {
    public static void main(String[] args) {
        System.out.println(checkingWhetherTwoStringsAreAnagrams("H e llo", "hello"));
    }

    public static boolean checkingWhetherTwoStringsAreAnagrams(String word1, String word2) {
        char[] charFromWord = word1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] charFromAnagram = word2.toLowerCase().toCharArray();
        Arrays.sort(charFromWord);
        Arrays.sort(charFromAnagram);
        return Arrays.equals(charFromWord, charFromAnagram);
    }
}
