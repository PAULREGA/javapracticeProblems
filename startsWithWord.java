public class StartsWithWord {
	public static boolean startsWithWord(String inputString, String inputWord){
	      return inputString.startsWith(inputWord);
	}
	public static void main(String[]args){
	      String inputString = "hello world";
	      String inputWord = "hello";
	      

	      boolean startsWith = startsWithWord(inputString, inputWord);
	      System.out.println(startsWith);
	}
}