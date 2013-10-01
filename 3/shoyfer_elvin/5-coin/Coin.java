import java.io.*;
import java.util.*;

public class Coin {
	private String face;
	private int flips, heads;
	private double fairness;

	public Coin() {
		resetCounts();
		setFairness(0.5);
		setFace("heads");
	}

	public void setFlips(int f) {
		flips = f;
	}

	public void setHeads(int h) {
		heads = h;
	}

	public void setFairness(double f) {
		fairness = f;
	}

	public void setFace(String f) {
		face = f;
	}

	public String getFace() {
		return face;
	}

	public int getHeads() {
		return heads;
	}

	public int getTails() {
		return flips - heads; 
	}

	public double getFairness() {
		return fairness;
	}

	public int getFlips() {
		return flips;
	}

	public void resetCounts() {
		setFlips(0);
		setHeads(0);
	}
}