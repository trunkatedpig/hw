public class Coin {
    private String face;
    private int flips, heads;
    private double probability;

    public Coin() {
	face = "Unflipped";
	flips = heads = 0;
	probability = 0.5;
    }

    public Coin(double probability) {
	face = "Unflipped";
	flips = heads = 0;
	this.probability = probability;
    }

    public void resetFlips() {flips = heads = 0;}

    public String getFace() {return face;}

    public void flip() {
	if (Math.random() < probability) {
	    face = "Heads";
	    heads += 1;}
	else {face = "Tails";}
    }
}
