import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private String name;
    private int flips, heads, tails;
    private int fairness;
    private double value;

    Random r = new Random ();

    public Coin (String n){
	name = n;
	fairness = 50;

	if (n.equals ("quarter")){
	    value = .25;
	} else if (n.equals ("dime")){
	    value = .10;
	} else if (n.equals ("nickel")) {
	    value = .05;
	} else if (n.equals ("penny")) {
	    value = .01;
	}

	int a = r.nextInt(2);
	if (a == 0) {
	    face = "heads";
	}
	else {
	    face = "tails";
	}
    }

    public void setFairness (int f){
	fairness = f;
    }

    public void resetCounts () {
	flips = 0;
	heads = 0;
	tails = 0;
    }
    
    public String  getFace () {
        return face;
    }

    public double getValue () {
        return value;
    }

    public int getHeadsCount () {
	return heads;
    }

    public int getTailsCount () {
	return tails;
    }

    public String flip () {
	flips = flips + 1;
	int a = r.nextInt (100);
	if (a < fairness) {
	    face = "heads";
	    heads = heads + 1;
	    }
	else {
	    face = "tails";
	    tails = tails + 1;
	}
	return face;
    }
}
