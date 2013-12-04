import java.io.*;
import java.util.*;

public class Coin{
    //VARIABLES
    private String face, coinType;
    private int flips, heads, tails;
    private double fairness, value;


    //CONSTRUCTORS
    public Coin(){
	flips = 0;
	heads = 0;
	tails = 0;
	fairness = 0.5;
	face = "none";   
    }

    public Coin(double prob){
	face = "none";
	flips = 0;
	heads = 0;
	tails = 0;
	fairness = prob;
    }

    public Coin(String name){
	coinType = name;
	if(coinType.equals("quarter")) {
	    value = 0.25;
	}
	else if(coinType.equals("dime")){
	    value = 0.10;
	}
	else if (coinType.equals("nickel")){
	    value = 0.05;
	}
	else if (coinType.equals("penny")){
	    value = 0.01;
	}
    }


    //METHODS
	public void resetFlips(){
	flips = 0;
	heads = 0;
	tails = 0;
    }

    public String getFace(){
	return face;
    }

    public int getFlips(){
	return flips;
    }

    public int getHeads(){
	return heads;
    }

    public int getTails(){
	return tails;
    }
    public void flipCoin(){
	double prob = Math.random();
	if (prob > fairness){
	    face = "heads";
	    heads = heads + 1;
		}
	else{
	    face = "tails";
	    tails = tails + 1;
		}
	flips = flips + 1;
    }
    public double getValue(){
	return value;
    }
 
}
