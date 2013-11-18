import java.io.*;
import java.util.*;

public class Coin {
	private String face;
	private int flips;
<<<<<<< HEAD
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

=======
	private int heads;
	private int tails;
	private double fairness;
	private String name;
	private double value;

	public void initCoin(double f, String n, double v) {
		flips = 0;
		heads = 0;
		tails = 0;
		fairness = f;
		name = n;
		value = v;
	}

	public Coin() {
		//initCoin(0.5, "penny", 0.01);
		flips = 0;
		heads = 0;
		tails = 0;
		fairness = 0.5;
		name = "quarter";
		value = 0.25;
		
	}

	public Coin(double f) {
		//initCoin(f);
		flips = 0;
		heads = 0;
		tails = 0;
		fairness = f;
		name = "quarter";
		value = 0.25;
	}

	public Coin(String n, double v) {
		//initCoin(f);
		flips = 0;
		heads = 0;
		tails = 0;
		fairness = 0.5;
		name = n;
		value = v;
	}

	public Coin(double f, String n, double v) {
		//initCoin(f);
		flips = 0;
		heads = 0;
		tails = 0;
		fairness = f;
		name = n;
		value = v;
	}


	public void resetFlips() {
		flips = 0;
	}


	public String flipCoin() {
		Random generator;
		generator = new Random();
		double r;
		r = generator.nextDouble();
		if (r < fairness) {
			face = "heads";
			heads = heads + 1;}
		else {
			face = "tails";
			tails = tails + 1;}
		flips = flips + 1;
		return face;
	}

	public double getValue() {
		return value;
	{

>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
}













