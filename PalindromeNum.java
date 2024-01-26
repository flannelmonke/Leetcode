/**
 * PalindromeNum
 */
public class PalindromeNum {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        String num = x + "";
        for (int i = 0; i < num.length(); i++) {
            if (!(num.charAt(i) == num.charAt(num.length() - 1 - i))) {
                return false;
            }
        }
        return true;
    }
}