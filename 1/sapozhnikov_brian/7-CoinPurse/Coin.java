import java.io.*;
import java.util.*;

public class Coin{
    private String face;
    private int flips, heads;
    private double fairness;
    private double value;
    private String name;

    public Coin(){
	reset();
    }
    public Coin(String n){
	name = n;
	if (n == "penny"){
	    value = .01;
	}
	else if (n == "nickel"){
	    value = .05;
	}
	else if (n == "dime"){
	    value = .1;
	}
	else{
	    value = .25;
	}
    }
    public Coin(double v){
	value = v;
	if (v == .01){
	    name = "penny";
	}
	else if (v == .05){
	    name = "nickel";
	}
	else if (v == .1){
	    name = "dime";
	}
	else{
	    name = "quarter";
	}
    }
    public Coin(String n, double v){
	reset();
	name = n;
	value = v;
    }

    public void reset(){
	flips = 0;
	heads = 0;
	fairness = .5;
	face = "heads";
	name = "penny";
	value = .01;
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
	return flips - heads;
    }
    public String getName(){
	return name;
    }
    public double getValue(){
	return value;
    }

    public void setFairness(double d){
	fairness = d;
    }

    public void flip(){
	flips = flips + 1;

	/*only allows for 50% fairness
	int r = (int)(Math.random()*2);
	if (r == 0){
	    face = "tails";
	}
	else {
	    face = "heads";
	*/
       
	//uses fairness variable
	double r = Math.random();
	if (r <= fairness){
	    face = "tails";
	}
	else {
	    heads = heads + 1;
	    face = "heads";
	}

    }

}
