import java.io.*;
import java.util.*;

public class Coin {

    private double currentnumber;
    private String face;
    private int heads, tails;
    private int fairness;

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
}
	
