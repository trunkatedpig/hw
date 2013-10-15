
public class Coin {
    private String face;
    private int tosses;
    private int heads;
    private double prob = 0.5; // another way to initialize
    private int value;

    public void initCoin(String f, Double p) {
	face = f;
	prob=p;
    }

    public Coin(int v) {
	value = v;
	initCoin("Heads",0.5);
    }

    public Coin() {
	initCoin("Heads",0.5);
    }


    public Coin(String f) {
	initCoin(f,0.5);
    }

    public String getFace() {
	return face;
    }

    public boolean equals(Coin other) {
	return face.equals(other.getFace());
    }

    public int getValue() {
	return value;
    }

    public String toString() {
	return ""+value+" cents";
    }

    public void flip() {
	double n = Math.random();
	if (n >= 0.5){
	    face = "heads";
	}
	else {
	    face = "tails"
    }

}
