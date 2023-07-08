public class Calculator {
	public static double divide(double dividend, double divisor) {
	      try {
		  return dividend / divisor;
	      } catch (ArithmeticException e) {
		System.err.println("Error: Division by zero");
		return Double.NaN;
	      }
	}
	public static void main(String[] args) {
	   double result = divide(10, 0);
	   System.out.println("Result: " + result);
	}
}