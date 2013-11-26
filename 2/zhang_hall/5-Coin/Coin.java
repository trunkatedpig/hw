import java.io.*;
import java.util.*;

public class Coin {
    //Instance Variables;
    private int flips, tails, heads;
    private double fairness;
    private String face;
<<<<<<< HEAD
=======
    //Coin Purse Additions;
    private String name;
    private double value;
    
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3

    //Constructors;
    public Coin(){
	face = "heads";
	heads = 0;
	tails = 0;
	flips = 0;
	fairness = 0.5;
<<<<<<< HEAD

    }
=======
	}

    //Advanced Coin Constructor
    public Coin(String n){
	name = n;
	if (n == "Quarter"){
	    value = .25;
	}
	if (n == "Dime"){
	    value = .10;
	}
	if (n == "Nickel"){
	    value = .05;
	}
	if (n == "Penny"){
	    value = .01;
	}
	face = "heads";
	fairness = 0.5;
	flips = 0;
	tails = 0;
	heads = 0;
    }
	
	    
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3

    //Methods;
    public void resetFlips(){
	flips = 0;
    }

    public String getFace(){
	return face;
    }

    public int getFlips(){
	return flips;
    }
<<<<<<< HEAD
=======
    
    public double getValue(){
	return value;
    }

    public void FlipCoin(){
	if (Math.random() >= fairness){
	    face = "heads";
	    heads = heads + 1;
	}
	else {
	    face = "tails";
	    tails = tails + 1;
	}
	flips = flips + 1;
	    }

    public void RiggCoin(double n){
        if (Math.random() >= n){
	    face = "heads";
	    heads = heads + 1;
	}
	else {
	    face = "tails";
	    tails = tails + 1;
	}
	flips = flips + 1;
    }
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
}

    
