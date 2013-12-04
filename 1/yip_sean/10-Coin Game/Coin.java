public class Coin {
	private boolean face;
	private int flips = 0, heads = 0;

	public boolean getFace() {return face;}
	
	public void flip() {
		if (Math.random() < 0.5) {
			face = true;
			flips++;
			heads++;}
		else {
			face = false;
			flips++;}
	}

	public void reset() {flips = heads = 0;}
}
