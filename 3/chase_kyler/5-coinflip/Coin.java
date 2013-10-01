import java.io.*;
import java.util.*;

public class Coin {
	private String face;
	private int flips;
	private int fairness;

	public Coin() {
		resetFlips();
		setFairness(50);
	}

	public Coin(int f) {
		resetFlips();
		setFairness(f);
	}

	public void resetFlips() {
		flips = 0;
	}

	public void setFairness(int f) {
		fairness = f;
	}

	public String flipCoin() {
		return face;
	}

}













