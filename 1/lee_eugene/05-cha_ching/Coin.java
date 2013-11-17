public class Coin {
    // I'm not so sure what we're trying to get at this,
    // so I did my best to just set up Coin.java to the best of my
    // abilities based on the assignment.
<<<<<<< HEAD
    private String name;
    private int flips;
    private int heads;
    private int tails;
    private int fairness;
    
    public reset() {
	flips = 0;
	heads = 0;
	tails = 0;
	fairness = 0;
    }
    
=======
    private boolean side; // I will have true be head, false tails
    private int flips, heads, tails;
    private double fairness;
    
    // Constructors
    public Coin() {
	reset();
    }
    // Other methods
    public void reset() {
	heads = tails = flips = 0;
	fairness = .5; // Have our Coin constructor be impartial and clean
    }
    public void flip() {
	if (Math.random() < fairness) { // Fairness to be used to flip
	    side = true;
	    flips++;
	    heads++;
	} else {
	    side = false;
	    flips++;
	    tails++;
	}
    }
    // Get methods
    public String getFace() {
	if (side) {
	    return "Heads";
	} else {
	    return "Tails";
	}
    }
    public int getHeads() {
	return heads;
    }
    public int getTails() {
	return tails;
    }
    public int getFlips() {
	return flips;
    }
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
}