import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int flips, heads;
    private double fairness;
    
    public Coin() {
	resetCounts();
	fairness = 0.5;
    }
    public Coin(double x) {
	resetCounts();
	fairness = x;
    }

    public void resetCounts(){
	flips = heads = 0;
    }
    
    public void flip(){
	double y;
	y = Math.random();
	if (x < fairness){
	    face = "Heads";
	    flips = flips + 1;
	    heads = heads + 1;
	}
	else {
	    face = "Tails";
	    flips = flips + 1;
	}
    }
    
    public String getFace() {
	return face;
    }
    
    public int getFlips(){
	return flips;
    }
    
    public int getHeads(){
	return heads;
    }
    
    public int getTails(){
	return flips - heads;
    }
    
}

    
    
