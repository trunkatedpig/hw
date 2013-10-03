public class Coin {
    private String face = "Unflipped";
    private int flips = 0;
    private int heads = 0;
    private double probability = 0.5;

    public Coin() {}

    public Coin(double probability) {
	this.probability = probability;
    }

    public void resetFlips() {flips = heads = 0;}

    public String getFace() {return face;}

    public void flip() {
	if (Math.random() < probability) {
	    face = "Heads";
	    heads += 1;
	}
	else {face = "Tails";}
    }
}
