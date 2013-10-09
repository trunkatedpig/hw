import java.io.*;
import java.util.*;
import java.math.*;

public class Coin {
    private String face = "In the middle";
    private int flips = 0,heads = 0,tails = 0;
    private double fairness = 0.5;
    private String name;
    private int value;

    public Coin(int v){
	value = v;
	if (v == 1) {
	    name = "penny";}
	else { if (v == 2) {
		name = "doublepenny";}
	    else { if (v == 5) {
		    name = "nickel";}
		else { if (v == 10) {
			name = "dime";}
		    else { if (v == 19) {
			    name = "butternickel";}
			else { if (v == 20) {
				name = "doubledime";}
			    else { if (v == 25) {
				    name = "quarter";}
				else { if (v == 40) {
					name = "doubledoubledime";}
				    else { if (v == 50) {
					    name = "half-dollar";}
					else { if (v == 100) {
						name = "dollar coin";}
					    else { name = "assorted nuts";}
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }		

    public void resetCount() {
	flips = 0;
	heads = 0;
	tails = 0;
    }

    public String getFace() {
	return face;
    }

    public int getFlips() {
	return flips;
    }

    public int getHeads() {
	return heads;
    }

    public int getTails() {
	return tails;
    }

    public double getFairness() {
	return fairness;
    }

    public int getValue() {
	return value;
    }

    public String getName() {
	return name;
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
