/*/**
 * IsPalindrome
 * A single letter is a palindrome, a two-letter word is a palindrome if the letters are the same, 
 * and any other word is a palindrome if the first letter is the same as the last and the middle is a palindrome.
 * Write a recursive method named isPalindrome that takes a String and returns a boolean indicating whether the word is a palindrome.
 */
public class IsPalindrome {
  public static boolean isPalindrome (String s) {
    s = s.toLowerCase().trim();
    if (s.length() == 1) {
      return true;
    } else if (s.length() == 2 && s.charAt(0) == (s.charAt(1))) {
      return true;
    } else if ((s.charAt(0) == s.charAt(s.length() - 1)) && isPalindrome(s.substring(1, s.length() - 1))) {
      return true;
    } else {
      return false;
    }
  }
  
  /* Uncomment to test
  public static void main (String[] args) {
    System.out.println(isPalindrome("A man a plan a canal panama"));
  }
  */
}