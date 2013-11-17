import java.io.*;
import java.util.*;

public class Coin {

<<<<<<< HEAD
    private String face;
    private int flips, heads, tails, fairness;
=======
    private String face, name;
    private int flips, heads, tails;
    private double fairness = .50;
    private double value;

    public Coin(){
	face = "Heads";
	reset();
	name = "half dollar";
	value = 0.50;
    }

    public Coin(String n, double f){
	name = n;
	face = "Heads";
	fairness = f;
	setValue();
	reset();
    }
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3

    public void reset() {
	flips = 0;
	heads = 0;
	tails = 0;
    }

    public String getFace() {
	return face;
    }

<<<<<<< HEAD
}
	    
=======
    public String flip(){
	if (Math.random() < fairness) {
	    face = "Heads";
	    heads = heads + 1;
	}
	else {
	    face = "Tails";
	    tails = tails + 1;
       	}
	flips = flips + 1;
	return face;
    }

    public int getFlips(){
	return flips;
    }

    public void setValue(){
	if (name.equals("half penny"))
	    value = 0.005;
	if (name.equals("penny"))
	    value = 0.01;
	if (name.equals("nickel"))
	    value = 0.05;
	if (name.equals("dime"))
	    value = 0.10;
	if (name.equals("quarter"))
	    value = 0.25;
	if (name.equals("half dollar"))
	    value = 0.50;
	if (name.equals("gold dollar"))
	    value = 1.00;
	    
    }

    public double getValue() {
	return value;
    }
    
    public int getHeads() {
	return heads;
    }

    public int getTails() {
	return tails;
    }
}
	    

	    
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
