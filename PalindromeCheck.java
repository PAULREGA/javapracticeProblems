public class PalindromeCheck {
      public static boolean isPalindrome(String str) {
	  String reversed = new StringBuilder(str).reverse().toString();
	  return str.equalsIgnoreCase(reversed);
      }

      public static void main(String[] args) {
	  String word = "dqwel";
	  boolean isPalindrome = isPalindrome(word);
	  System.out.println(word + " is a palindrome? " + isPalindrome);
      }
}