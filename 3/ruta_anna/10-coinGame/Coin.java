import java.io.*;
import java.util.*;

public class Coin{

	private String face;
	private int flipCount;
	private int headCount;
	private double probability;

/* Creation of constructor that can call the Coin class */

	public Coin() {
		initCoin("Heads");
	}


/* Method used to initialize the Coin. Sets all of the Coin instance variables */

	public void initCoin(String f) {
		face = f;
		probability = 0.5;
		resetCounts();
	}

/* Using random in driver, set either heads or tails of coin */

	public void setCurrentFace(double r) {
		if (r >= 0.5) {
			face = "Heads";
		}
		else {
			face = "Tails";
		}
	}

/* Set basic get methods */

	public String getFace() {
		return face;
	}

	public int getFlipCount() {
		return flipCount;
	}

	public int getHeadCount() {
		return headCount;
	}

	public double getProb() {
		return probability;
	}


/* Sets the flipCount and headCount value after a coin flip based on the face of new coin */

	public void flipCoin() {
		flipCount += 1;
		if (face == "Heads") {
			headCount += 1;
		}
	}

/* Sets the probability of the coin landing on heads based on previous trials */

	public void adjustProb(){
		probability = (double) headCount / (double) flipCount;
	}


	public void resetCounts() {
		flipCount = 0;
		headCount = 0;
	}

}