
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
	Random r;
	int n;
	r = new Random();
	n = r.nextInt();
	flips = flips + 1;
	if (n > fair) {
	    setFace("Heads");
	    nheads = nheads + 1;
	} else {
	    setFace("Tails");
	    ntails = ntails + 1;
	}
    
    }

}