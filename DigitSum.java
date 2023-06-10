public class DigitSum {
	public static int sumDigits(int number) {
		int sum = 0;
		while (number != 0) {
		     int digit = number % 10; 
		     sum += digit;
	   	     number /= 10;
	        }
		return sum;
	}

    public static void main(String[]args) {
	   int number = 1234;
	   int sum = sumDigits(number);

	   System.out.println("The Digit sum value of :" + number + "is " + sum);
    }
}

