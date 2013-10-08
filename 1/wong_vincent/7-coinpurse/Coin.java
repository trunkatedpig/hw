import java.io.*;
import java.util.*;

public class Coin {

    private double currentnumber;
    private String face;
    private int heads, tails;
    private int fairness;
    private int value;
    private String name;

    public Coin (int a) {
	if (a == 1) {
	    value = 1;
	    name = "Penny";
	}
	if (a == 5) {
	    value = 5;
	    name = "Nickel";
	}
	if (a == 10) {
	    value = 10;
	    name = "Dime";
	}
	if (a == 25) {
	    value = 25;
	    name = "Quater";
	}
    }

    public void reset () {
	setFace ("You didn't flip yet");
	setHeads (0);
	setTails (0);
    }

    public void flip() {
	currentnumber = Math.random();

	if (currentnumber < 0.5) {
	    setFace("Heads");
	    heads = heads + 1;
	}
	else {
	    setFace("Tails");
	    tails = tails + 1;
	}
    }

    public void setFace (String a) {
	face = a;
    }
    
    public void setHeads (int b) {
	heads = b;
    }
    
    public void setTails (int c) {
	tails = c;
    }

    public String getFace() {
	return face;
    }
    
    public int getHeads() {
	return heads;
    }

    public int getTails() {
	return tails;
    }

    public int getFairness() {
	fairness =  heads/(heads + tails);
	return fairness;
    }

    public int getValue() {
	return value;
    }
    
    public String getName() {
	return name;
    }
}
	
