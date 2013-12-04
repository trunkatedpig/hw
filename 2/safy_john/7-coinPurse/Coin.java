//Andrew Fischer & John Safy
//testing
import java.io.*;
import java.util.*;


public class Coin {

    //Instance Vars
    private String f, face;
    private int flips, heads, tails;
    private double r, prob;
    private double coinVal;
    private String coinName;
    private double value;

    //Constructors

    public int Coin(String coinName) {
	if (coinName == "penny"){
	    coinval = .01;
	}
	else if (coinName == "nickel"){
	    coinval = .05;
	}
	else if (coinName == "dime"){
	    coinVal = .1;
	}
	else{
	    coinVal = .25;
	}
	return coinVal;
    }
    
    public Coin(int coinVal) {
	if(coinVal == .25)
	    {
		coinName = "Quarter";
	    }
	if(coinVal == .05)
	    {
		coinName = "Nickel";
	    }
	if(coinVal == .10)
		{
		    coinName = "Dime";
		}
	if(coinval == .01)
	    {
		coinName = "Penny";
	    }
	return coinName;
    }

    //Methods

    public void reset(){
        flips = 0;
        heads = 0;
        tails = 0;
	face = f;
	prob = 0.5;
    }

    public void flip(){
	r = Math.random();
	
        if (r > prob) {
	    face = "heads";
	    heads = heads + 1;
	    flips = flips + 1;
		}
	else {
	    face = "tails";
	    tails = tails + 1;
	    flips = flips + 1;
		}
    }

    ///Get Methods

    public String getFace(){
        return face;
    }

    public double getVal(String coinName){
	return coinName.Coin();
    }

    //Set methods
    
    public void setOdds(double p){
	prob = p;
    }
}
