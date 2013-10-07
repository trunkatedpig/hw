import java.io.*;
import java.util.*;

public class Coin{
    private String face, name;
    private int flips, fairness, heads, tails, value;

    public Coin(String name) {
	fairness = 50;
	if ( name == "Quarter" )
	    value = 25;
	if ( name == "Dime" )
	    value = 10;
	if ( name == "Nickel" )
	    value = 5;
	if ( name == "Penny" )
	    value = 1;
    }

    public void reset() {
	flips = 0;
	heads = 0;
	tails = 0;
    }

    public String getFace(){
	return face;
    }

    public int getFlips() {
	return flips;
    }
    
    public int getHeads() {
	return heads;
    }

    public int getTails() {
	return tails;
    }
    
    public String flip() {
	flips += 1;
	double r = Math.random();
	if (r*100 > fairness ) {
	 heads += 1;
	    return "Heads";
	    //return r;
	}
	else {
	    tails += 1;
	    return "Tails";
	    //return r;
	}
	
    }

    public int getValue() {
	return value;
    }

    /*public void setName (String s) {
	name = s;
	}*/

}
