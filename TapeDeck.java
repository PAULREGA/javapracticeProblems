class TapeDeck {
	boolean canRecord = false;

	void playTape() {
		System.out.println("Play the Tape");
	}
	void recordTape() {
		System.out.println("Tape Recording");
	}
   }
class TapeDeckTestDrive {
	public static void main(String [] args) {

	TapeDeck t = new TapeDeck();
	t.canRecord = true;
	t.playTape();
	
	if (t.canRecord == true) {
		t.recordTape();
	}
    }
 
 }
	
