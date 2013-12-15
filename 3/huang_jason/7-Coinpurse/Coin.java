import java.io.*;
import java.util.*;
import java.math.*;


public class Coin {
    public String face = "In the middle";
    public int flips = 0,heads = 0,tails = 0;
    public double fairness = 0.5;
    public String name;
    public int value;

    public Coin(String n, int v){
	name = n;
	value = v;
    }

    public int getValue(){
	return value;
    }

    public void resetCount() {
	flips = 0;
	heads = 0;
	tails = 0;
    }

    public String getFace() {
	return face;
    }

    public void flip() {
	flips = flips + 1;
	if (Math.random() >= fairness) {
	    tails = tails + 1;
	    face = "Tails";
	    }
	else {
	    heads = heads + 1;
	    face = "Heads";
	}
    }
	
    public void changeFairness(double newFairness) {
	fairness = newFairness;
    }
}
