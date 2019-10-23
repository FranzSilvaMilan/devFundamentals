public class Exercise3 {
    public static void main(String[] args){
        System.out.println(isPalindrome("aabaa"));
    }

    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
