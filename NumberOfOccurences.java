public class NumberOfOccurences {
     public static int CountOccurences(String InputWord, String InputString){
	/// Split the input string into words
	String[] words = inputString.split("\\s+");
	
	int count = 0;
	//iterate each word to check if it matches given word (input value) 
	for (String w: words) {
		if (w.equals(word)) {
		    count ++;
	        }
	}
	
	return  count;
     }
     public static void main(String[] args) {
	String inputString = "Hello World, Hello, there World";
	String Word = "World";
		
	int occurences = CountOccurences(Word, inputString);
	System.out.println("Number of occurences of" + word + "is :" + occurences);
	}
}

