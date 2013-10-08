import java.io.*;
import java.util.*;

public class Coin {
    private String face, name;
    private int flips, heads, tails;
    private double fairness;
    private double amount;
    private String coinname;

    public Coin (double x, String n) {
	amount = x;
	coinname = n;
    }

    public Coin (double x){
	setAmount (x);
    }

    public Coin (String n ) {
	setCoinname (n);
    }

    public void setAmount (double f) {
	amount = f;
	if (amount == 0.01){
	    coinname = "penny";
	}
	else if (amount == 0.05){
	    coinname = "nickel";
	}
	else if (amount == 0.10){
	    coinname = "dime";
	}
	else if (amount == 0.25){
	    coinname = "quarter";
	}
	else if (amount == 0.50){
	    coinname = "half dollar";
	}
	else if (amount == 1.00){
	    coinname = "dollar coin";
	}
	else {
	    coinname = amount + " Dollar coin";
		}
    }

    public void setCoinname (String n){
	coinname = n; 
	if (coinname == "penny") {
	    amount = 0.01;
	}
	else if (coinname == "nickel") {
	    amount = 0.05;
	}
	else if (coinname == "dime") {
	    amount = 0.10;
	}	
	else if (coinname == "quarter") {
	    amount = 0.25;
	}
	else if (coinname == "half dollar") {
	    amount = 0.50;
	}
	else if (coinname == "dollar coin") {
	    amount = 1.00;
	}
	else {
	    coinname = n;
		}
    }
    public double getAmount () {
	return amount;
    }
    public String getCoinname () {
	return coinname;
    }
	
 
    public void resetCount (){
        setFace ("");
	setHeads (0);
	setTails (0);
	setFlips (0);
	setFairness (0.0);
    }

    public void setFace (String f) {
	face = f;
    }
    public void setHeads (int h) {
	heads = h;
    }   

    public void setTails (int t) {
        tails = t;
    }
    public void setFlips (int w) {
	flips = w;
    }

    public void setFairness (double u) {
	fairness = u;
    }   
    /* fairness will be from 0 to 100 percent, can add in decimals too to make more precise */
    public String getFace () {
	return face;
    }

    public int getFlips () {
	return flips;
    }

    public int getHeads () {
	return heads;
    }

    public int getTails () {
	return tails;
    }
    public double getFairness () {
	return fairness;
    }


    public void coinFlip () {
	double r;
	r = Math.random ();
	double r2 = r * 100;
	if (r2 <= fairness) {
	    setFace ("Heads");
	    setHeads (heads + 1);
	    setFlips (flips + 1);
 
	}

	else {
	    setFace ("Tails");
	    setTails (tails + 1);
	    setFlips (flips + 1);
	}
 
    }
    public void FlipxTimes (int x) {

        coinFlip ();
        x = x - 1;
 
	if (x > 0) {
	    FlipxTimes (x) ;
 
    
	}
    }
}
