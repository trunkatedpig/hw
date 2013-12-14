import java.io.*;
import java.util.*;

public class Coin {
    
    private String face, value;
    private int heads, tails, flips;
    private double fairness, amount;


    public Coin(){
	value = "Quarter";
	amount = .25;
	fairness = 0.5;
	heads = 0;
	tails = 0;
	flips = 0;
    }


    public Coin(String v, double stats){
	value = v;
	setValue(v);
	fairness=stats;
	heads = 0;
	tails = 0;
	flips = 0;
    }

    public void setValue(String denomination){
	if (denomination == "Quarter")
	    amount = 0.25;
	if (denomination == "Dime")
	    amount = 0.10;
	if (denomination == "Nickel")
	    amount = 0.05;
	if (denomination == "Penny")
	    amount = 0.01;
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

    public double getValue() {
	return amount;
    }

    public String getName() {
	return value;
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
    
