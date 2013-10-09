import java.io.*;
import java.util.*;

public class Coin {
	private String face, name;
	private int flips, heads, value;
	private double fairness;


	// value given in cents
	// face and name are all lowercase


	public Coin() {
		resetCounts();
		setFairness(0.5);
		setFace("heads");
		setName("dime");
		setValue(10);
	}

	public Coin(String n, int v, double f1, String f2) {
		resetCounts();
		setFairness(f1);
		setFace(f2);
		setName(n);
		setValue(v);
	}

	// sets

	public void setFlips(int f) {
		flips = f;
	}

	public void setHeads(int h) {
		heads = h;
	}

	public void setName(String n) {
		name = n;
	}

	public void setValue(int v) {
		value = v;
	}

	public void setFairness(double f) {
		fairness = f;
	}

	public void setFace(String f) {
		face = f;
	}

	public void resetCounts() {
		setFlips(0);
		setHeads(0);
	}

	// gets

	public String getFace() {
		return face;
	}

	public int getHeads() {
		return heads;
	}

	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
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

	// methods

	public void flip() {
		flips = flips + 1;
		double rand = Math.random();
		if (rand >= fairness) {
			setFace("heads");
			heads = heads + 1;
		} else {
			setFace("tails");
		}	
	}
}