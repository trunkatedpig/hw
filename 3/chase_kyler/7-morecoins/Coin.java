import java.io.*;
import java.util.*;

public class Coin {
	private String face;
	private int flips;
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

	public Coin(String n) {
		flips = 0;
		heads = 0;
		tails = 0;
		fairness = 0.5;
		name = n;
		if (name == "penny") {
			value = 0.01;}
		else if (name == "nickel") {
			value = 0.05;}
		else if (name == "dime") {
			value = 0.1;}
		else if (name == "dollar") {
			value = 1.0;}
		else {
			value = .25;}
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
	}

}













