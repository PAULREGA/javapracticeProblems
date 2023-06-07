public class MaximumOfThreeNumbers {
	public static int findMaximum(int num1, int num2, int num3) {
		int max = num1;
		if (num2 > max) {
		    max = num2;
		}
		if (num3 > max) {
		    max = num3;
		}
		return max;
	}
	public static void main(String[] args) {
		int max = findMaximum(5,10, 3);
		System.out.println("Maximum: " + max);
	}
}