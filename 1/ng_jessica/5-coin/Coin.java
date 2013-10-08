import java.io.*;
import java.util.*;


public class Coin {
    private String face; 
    private int flips;
    private int numHeads; 
    private int numTails; 
    private int fairness; 

    public void reset (){
	flips = 0; 
	numHeads = 0; 
	numTails = 0; 
	fairness = 0;
    }

    public String getFace (){
	return face;
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
}
