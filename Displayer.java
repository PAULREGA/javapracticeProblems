public class Displayer {

	public void displayName(String firstName) {
		System.out.println("Name is:" + firstName);
	}
	public void displayName(String firstName, String lastName) {
		System.out.println("Name is:" +firstName + "  " +lastName);
	}
	
	public static void main(String [] args) {
		Displayer displayer = new Displayer();
		displayer.displayName("Ram");
		displayer.displayName("Jon", "Skeet");
	}
    }