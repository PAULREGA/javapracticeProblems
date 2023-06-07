public class GradeCalculator {
	public static char calculateGrade(double marks) {
	    if (marks >= 90) {
		return 'A';
	    } else if (marks >= 80) {
	        return 'B';
	    } else if (marks >= 70) {
	        return 'C';
	    } else if (marks >= 60) {
	        return 'D';
	    } else  {
	        return 'F';
	   }
	}
	
	public static void main(String[] args) {
		double marks = 85.5;
		char grade = calculateGrade(marks);
		System.out.println("Grade: " + grade);
	}
}