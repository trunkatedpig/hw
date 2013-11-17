import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int flips;
    private int heads;
    private int tails;
<<<<<<< HEAD
    private int fairness;
=======
    private double fairness;
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
    public Coin() {
	face = "Heads";
	flips = 10;
	heads = 3;
	tails = 7;
<<<<<<< HEAD
	fairness = 50;
    }
    public void resetFlips(){
	flips = 0;
=======
	fairness = .5;
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
    }
    public String getFace() {
	return face;
    }
<<<<<<< HEAD
}
=======
    public int getFlips() {
	return flips;
    }
    public int getHeads() {
	return heads;
    }
    public int getTails() {
	return tails;
    }
    public double getProb() {
	return fairness;
    }
    public void flip(){
	if( Math.random() < .5){
	    face = "Heads";
	    flips = flips + 1;
	    heads = heads + 1; 
	}
	else {
	    face = "Tails";
	    flips = flips + 1;
	    tails = tails + 1;
	}
    }
    public void changeProb(double x) {
	fairness = x;
    }
    public void reset(){
	flips = 0;
	heads = 0;
	tails = 0;
	face = "The coin has not yet been flipped";
    }
}

>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
