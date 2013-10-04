import java.io.*;
import java.util.*;

public class Coin {
    
    private String face;
    private int heads, tails, flips;
    private double fairness, amount;


    public Coin(){
	fairness=0.5;
	heads = 0;
	tails = 0;
	flips = 0;
    }


    public Coin(double stats){
	fairness=stats;
	heads = 0;
	tails = 0;
	flips = 0;
    }


    public void reset() {
	heads = 0;
	tails=0;
	flips=0;
	fairness=0.5;
    }

    public String getFace() {
	return face;
    }

    public void flip(){
	if (Math.random() < fairness) {
	    heads += 1;
	    flips += 1;
	    face = "Heads";
	}
	else {
	    tails += 1;
	    flips += 1;
	    face = "Tails";
	}
	  
}
}
    
