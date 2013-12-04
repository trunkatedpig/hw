import java.io.*;
import java.util.*;

public class Coin {
    
    //Instance Variables
    private String face, name;
    private int flips, heads, tails;
    private double prob, value; 


    //COINPURSE STUFF

    public Coin (String coinName, double coinValue) {
	name = coinName;
	value = coinValue;
    }

    public double getValue() {
	return value;
    }
    
    //Methods
    public void reset () {
	flips = 0;
	heads = 0;
	tails = 0;
    }

    public void setProb(double r) {
	prob = r;
    }

    public void flip () {
	
	if (Math.random() > prob) {
	    face = "heads";
	    heads = heads + 1;
	    flips = flips +1;
	}
	
	else {
	    face = "tails";
	    tails = tails + 1;
	    flips = flips + 1;
	}
    }

    //Get Methods
    public String getFace () {
	return face;
    }

    public String getFlips() {
	return "There are " + flips + " flips. " + "There are " + heads + " heads. " + "There are " + tails + " tails.";
    }

    public String getCurrentFace() {
	return "The face is " + face;
    }

}