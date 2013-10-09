import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int flips, heads, tails, value;
    private double probability;

    public Coin() {
	face = "heads";
	counts = 0;
	heads = 0;
	tails = 0;
	probability = 0.5;
	if (n == "quarter") {
	    value = 25;
	}
	else if (n == "dime") {
	    value = 10;
	}
	else if (n == "nickel") {
	    value = 5;
	}
	else if (n == "penny") {
	    value = 1;
	}
    }
    public void resetCounts(){
	flips = 0;
    }
    public void flip() {
	Random r = new Random();
	counts = counts + 1;
	if (r.nextDouble() >= probability) {
	    face = "heads";
	    heads = heads + 1;
	}
	else {
	    face = "tails";
	    tails = tails + 1;
	}
    }	
    public String getFace(){
	return face;
    }
    public int getCount(){
	return flips;
    }
    public int getValue(){
	return value;
    }
    public String getInfo() {
	return name + "\n" + Integer.toString(value);
    }
}