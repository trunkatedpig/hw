/*worked with mark norwich
  aida piccato also helped*/

import java.io.*;
import java.util.*;


public class Coin {
    private int heads,counts,tails,value;
    private String face, name;
    private double prob;


    public Coin(String n){
	face="heads";
	counts = 0;
	heads = 0;
	tails = 0;
	name = n;
	prob = 0.5;
	if (n.equals("penny")) {
	    value = 1;
	}

	else if (n.equals("nickel")){
	    value = 5;
	}
	else if (n.equals("dime")){
	    value = 10;
	}

	else if (n.equals("quarter")){
	    value =25;
	}}

	public String getFace(){
	return face;
	}
	
    public int getCount(){
	return counts;
	}

	public int getValue(){
	return value;
	}


	public String getInfo() {
	return name + "\n" + Integer.toString(value);
	}

	public void resetCounts(){
	    counts = 0;
	}

	public void flip(){
	    Random r = new Random();
	    counts = counts +1;
	    if (r.nextDouble() < prob){
		face = "tails";
		tails = tails+1;
	    }
	    else {
		face= "heads";
		heads= heads +1;
	    }
	    




	}
}
