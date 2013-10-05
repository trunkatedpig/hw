//Andrew Fischer & John Safy

import java.io.*;
import java.util.*;


public class Coin {

    //Instance Vars
    private String f, face;
    private int flips, heads, tails;
    private double r, prob;
    private int coinVal;
    private String coinName;

    //Constructors

    public Coin() {
	if(coinVal == 25)
	    {
		coinName = "Quarter";
	    }
	if(coinVal == 5)
	    {
		coinName = "Nickel";
	    }
	if(coinVal == 10)
	    {
		coinName = "Dime";
	    }
	
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


}
