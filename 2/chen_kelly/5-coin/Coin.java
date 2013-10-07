import java.io.*;
import java.util.*;

public class Coin{
    //VARIABLES
    private String face;
    private int flips, heads, tails;
    private double fairness;


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
 
}
