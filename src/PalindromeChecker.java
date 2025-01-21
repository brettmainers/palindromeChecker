public class PalindromeChecker {
    
    // recursive method to check if the word is a palindrome
    public static boolean isPalindrome(String input, int start, int end) {
        if (start >= end) {
            return true;
        }
        else if (input.charAt(start) != input.charAt(end)) {
            return false;
        }
        else {
            return isPalindrome(input, start + 1, end - 1);
        }
    }
}
