public class Fibonacci {
	public static int fibonacci(int n) {
	    if(n <= 0) {
		return n;
	    } else {
		return n * fibonacci(n - 1) + fibonacci(n - 2);
	    }
	}
public static void main(String[] args) {
	int number = 7;
	System.out.println("Fibonacci Series up to" + number + "terms: " );
	for(int i = 0; i < number; i++){
	System.out.println(fibonacci(i) + " ");
	}
   }
}