import java.io.*;
import java.util.*;

public class Coin {
    private int face;
    private int heads;
    private int tails;
    private double weight;

    public Coin() {
	heads = 0;
	tails = 0;
	weight = 0.5;
    }

    public Coin(double weight) {
	this.weight = weight;
	heads = 0;
	tails = 0;
    }

    public void reset() {
	heads = 0;
	tails = 0;
    }

    public String getFace() {
	if (face == 0) {
	    return "Heads";
	}
	else {
	    return "Tails";
	}
    }

    public int getCount() {
	return heads + tails;
    }

    public int getHeads() {
	return heads;
    }

    public int getTails() {
	return tails;
    }

    public double getWeight() {
	return weight;
    }

    public void setWeight(double weight) {
	this.weight = weight;
    }

    public void roll() {
	double rand = Math.random() - 0.5 + weight;
	face = (int) Math.round(rand);
	if (face == 0) {
	    heads ++;
	}
	else {
	    tails ++;
	}
    }
}