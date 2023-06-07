public class FibonacciSeries {
    public static void printFibonacci(int n) {
	int first = 0, second = 1;
	System.out.print("Fibonacci Series: " + first + " " + second);
	
	for (int i = 2; i < n; i++) {
	     int next = first + second;
	     System.out.print(" " + next);
	     first = second;
	     second = next;
	}
    }
 
    public static void main(String[] args) {
	int count = 10;
	printFibonacci(count);
    }
}