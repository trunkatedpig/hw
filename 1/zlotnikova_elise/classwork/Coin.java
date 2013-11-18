import java.io.*;
import java.util.*;

public class Coin {
    private String face,name;
    private int flips,heads,tails;
    private double fairness,amount;
    private double num;
    
 
    public void reset() { 
	flips = 0; 
	heads = 0; 
	tails = 0; 
	fairness = 0.0;
    }
    
    public String getFace() { 
	return face;
    }
    
    public void Flip() {
	flips = flips + 1;
	num = Math.random();
	if (num < 0.5) {
	    face = "heads";
	    heads = heads + 1;
	}
	else {
	    face = "tails";
	    tails = tails + 1;
	}
    }
    
    public int getFlips() { 
	return flips;
    }
   
    public double getFairness() {
	return heads/flips;
    }
    
    public void amount(String n, double v) {
	name = n;
	amount = v;
    }
}

