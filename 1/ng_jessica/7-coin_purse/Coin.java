import java.io.*;
import java.util.*;


public class Coin {
    private String face; 
    private String name; 
    private double value; 
    private int flips;
    private int numHeads; 
    private int numTails; 
    private int fairness; 

    public void reset (){
	flips = 0; 
	name = "";
	value = 0.00; 
	numHeads = 0; 
	numTails = 0; 
	fairness = 0;
    }

    public String getFace (){
	return face;
    }

    public String getName() {
	return name; 
    }
    
    public double getValue() {
	return value; 
    }
    
    public int getFlips() {
	return flips; 
    }

    public int getNumHeads() {
	return numHeads;
    }

    public int getNumTails() {
	return numTails; 
    }

    public int getFairness () {
	return fairness; 
    } 

    public void setFairness (int n) {
	fairness = n; 
    }

    public void flip (){
	flips = flips + 1; 
	double r; 
	r = Math.random(); 
	r = r * 100; 
	if (r <= fairness) {
	    face = "heads";
	    numHeads = numHeads + 1;
	}
	else {
	    face = "tails";
	    numTails = numTails + 1; 
	}
    }
    
    public void setName (String n) {
	if (n == "penny") {
	    name = n; 
	    value = 0.01; 
	}
	if (n == "nickel") {
	    name = n; 
	    value = 0.05; 
	}
	if (n == "dime") {
	    name = n; 
	    value = 0.10; 
	}
	if (n == "quarter") {
	    name = n; 
	    value = 0.25; 
	}
    }

    public void setValue (double n) {
	if (n == 0.01) {
	    value = n;
	    name = "penny"; 
	}
	if (n == 0.05) {
	    value = n;
	    name = "nickel"; 
	}
	if (n == 0.10) {
	    value = n;
	    name = "dime"; 
	}
	if (n == 0.25) {
	    value = n;
	    name = "quarter"; 
	}
    }
}
