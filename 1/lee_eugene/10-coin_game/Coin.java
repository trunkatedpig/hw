public class Coin {
    private String side;
    private void flip() {
	if (Math.random() < 0.5) { // Remember Math.random pumps out double < 1
	    side = "Heads";
	} else {
	    side = "Tails";
	}
    }
    public String getSide() {
	return side;
    }
}