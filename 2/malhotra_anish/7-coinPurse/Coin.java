//Tina Lee and Anish Malhotra

import java.io.*;
import java.util.*;

public class Coin { 
    private String face;
    private String face1;
    private String face2;
    private int numflips;
    private int numheads;
    private int numtails;
    private int fairness;
    private double value;
    private String name;

    public Coin(){
	face = "tails";
    }

    public Coin(String n){
	name = n;
	if (n == "quarter")
	    value = 0.25;
	else if (n == "dime")
	    value = 0.10;
	else if (n == "nickel")
	    value = 0.05;
	else if (n == "penny")
	    value = 0.01;
	face = "tails";
    }
    
    public Coin(double val){
    	value = val;
    	if (val == 0.25)
    		name = "quarter";
    	else if (val == 0.10)
    		name = "dime";
    	else if (val == 0.05)
    		name = "nickel";
    	else if (val == 0.01)
    		name = "penny";
    	else
    		name = "Goob coin";
    }
    
    public void resetCount(){
    	numflips = 0;
    	numheads = 0;
    	numtails = 0;
    }

    public double val(){
    	return value;
    }

    public String getFace(){
    	return face;
    }
    
    public String flipCoin(){
    	fairness = (int)(Math.random() * 100);
    	if (fairness < 50){
	    face = "heads";
	    numheads++;
    	}
    	else{
	    face = "tails";
	    numtails++;
    	}
    	numflips++;
    	return face;
    }
    
    public boolean coinsEqual(){
    	face1 = flipCoin();
    	face2 = flipCoin();
    	return face1.equals(face2);
    }

}
