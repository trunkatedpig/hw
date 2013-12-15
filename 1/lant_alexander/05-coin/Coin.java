import java.util.*;
import java.io.*;


public class Coin {
       
    private String face;
    private Random r = new Random();
    private int result;
    private int heads;
    private int tails;
    private int flips;
    private double fairness;

    public int coin() {	
	result = r.nextInt(2);
	return result;
 }
	
    public String getFace() {
	if (result == 0) {
	    face = "heads";
	    heads = heads + 1;
	}
	else {
	    face = "tails";
	    tails = tails + 1;
		}

	flips = flips + 1;
	return face;
    }
	
		    
    public double getFairness() {
	fairness = heads/(heads + tails);
	return fairness;    
    }

    public int getHeads() {
	return heads;
    }

    public int getTails() {
	return tails;
    }

    public int getFlips() {
	return flips;
    }
   
	
 }
    

