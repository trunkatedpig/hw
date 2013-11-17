import java.io.*;
import java.util.*;

public class Coin {
    private String face;
<<<<<<< HEAD
    private int flips;
    private int heads;
    private int tails;
    private int fairness;
    
    public Coin (String x) {
	face = x;
    }

    public void resetCounts(){
	flips = 0;
=======
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
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
    }
    
    public String getFace() {
	return face;
    }
<<<<<<< HEAD
=======
    
    public int getFlips(){
	return flips;
    }
    
    public int getHeads(){
	return heads;
    }
    
    public int getTails(){
	return flips - heads;
    }
    
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
}

    
    
