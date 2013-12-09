
import java.io.*;
import java.util.*;


public class coin {
    private String face;
    private int flips;
    private int heads;
    private int tails;
    private double fairness;
    
    public void flip(){
	flips = flips + 1;
	Random r = new Random;
	int flipped = (r.nextInt(2));
    }

    public void reset() {
	flips = 0;
	heads = 0;
	tails = 0;
	fairness = 0;
    }
    
    public String getFace(){
	return face;
    }
}

public setFace (int flipped) {
    if (flipped == 0){
	face = "heads";
	heads = heads + 1;
	    }
    else {
	face = "tails";
	tails = tails + 1;
	    }
}

public void setFairness(int heads, int flips) {
    if (flips > 0){
	fairness = heads/flips
	    }
    return fairness;
	}