import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int flips,heads,tails;
    private double fairness;
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
	num = Math.random();
	if (num < 0.5) {
	    face = "heads";
	    heads = heads + 1;
	}
	else {
	    face = "tails";
	    tails = tails + 1;
	}
	flips = flips + 1;
    }
}
