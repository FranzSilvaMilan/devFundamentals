public class Exercise3 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("aabaa"));
    }

    public static boolean isPalindrome(String word) {
        return word.equals(new StringBuilder(word).reverse().toString());
    }
}
