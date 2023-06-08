import java.util.Arrays;

public class AnagramSolver {
	public static boolean areAnagram(String word1, String word2){
	     // converting strings to lowercase

	     word1 = word1.toLowerCase();
	     word2 = word2.toLowerCase();

             // removing whitespaces

	     word1 = word1.replaceAll("\\s", "");
	     word2 = word2.replaceAll("\\s", "");

             // checking wordlength

	     if (word1.length() != word2.length()){
		return false;
	     }

	     //converting words to characters
	     char[] charArray1 = word1.toCharArray();
	     char[] charArray2 = word2.toCharArray();

	     Arrays.sort(charArray1);
	     Arrays.sort(charArray2);

	     //compare sorted characters
	     return Arrays.equals(charArray1, charArray2);
	}

	public static void main(String[] args) {
	       String word1 = "silent";
	       String word2 = "listen";	

	if (areAnagram(word1, word2)) {
	     System.out.println(word1 + "and" + word2 + "Are anagrams");
	} else {
		System.out.println(word1 + "and" + word2 + "Are not anagrams");
		}
	}
}

	      
	     	

	     
	      