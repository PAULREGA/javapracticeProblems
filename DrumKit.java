class DrumKit {
	boolean topHat = true;
	boolean snare = true;
	
	void playTopHat() {
	System.out.println("ding ding da-ding");
	}
	void playSnare() {
	System.out.println("Bang bang ba-bang");
	}
    }
class DrumKitTestDrive {
	public static void main(String [] args) {
		DrumKit d = new DrumKit();
		d.playSnare();
		d.snare = false;
		d.playTopHat();
	
	if (d.snare == true) {
	d.playSnare();
	}
     }
  }