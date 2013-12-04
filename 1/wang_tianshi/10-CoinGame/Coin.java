
public class Coin {
    private String face;
    private int tosses;
    private int heads;
    private double prob = 0.5; // another way to initialize
    private int value;

    public void initCoin(String f, Double p) {
	face = f;
	tosses=0;
	heads=0;
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
	// generate a random number and set face to heads
	// or tails 

	tosses = tosses + 1;

	/*only allows for 50% fairness
	int r = (int)(Math.random()*2);
	if (r == 0){
	    face = "tails";
	}
	else {
	    face = "heads";
	*/
       
	//uses fairness variable
	double r = Math.random();
	if (r <= prob){
	    face = "Tails";
	}
	else {
	    heads = heads + 1;
	    face = "Heads";
	}
    }

}
