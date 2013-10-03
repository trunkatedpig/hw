import java.io.*;
import java.util.*;

public class Coin { 

    // Different instance  variables of the class 

    private String face;
    //Which face the coin flips on to

    private int flips, heads, tails, fairness;
    // variables, in order
    // The total number of flips
    // The number of heads and tails, respectively
    // the fairness of the coin (how often tails vs. heads)

    public Coin (){
    face = "Heads";
    flips = 5;
    heads = 3;
    tails = 2;
    fairness = 50;
    }

    //Methods
    
    public void resetCount(){
	flips = 0;
	    }

    //get Method 
    
    public int getFlips(){
	return flips;
    }

    public String getFace(){
	return face;
    }
}
