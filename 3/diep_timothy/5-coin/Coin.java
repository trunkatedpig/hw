import java.io.*;
import java.util.*;

public class Coin {
    
    private String face;
    private int heads = 0;
    private int tails = 0;
    private int flips = 0;
    private double fairness;
    private String name;
    private int value;

    public Coin() {
	setFlips(0);
	setHeads(0);
	setTails(0);
    }
	
    public Coin(String n, int v) {
	name = n;
	value = v;
    }

    public Coin(int v) {
	if (v == 25) {
	    name = "Quarter";
	    value = 25;
	} else if (v == 10) {
	    name = "Dime";
	    value = 10;
	} else if (v == 5) {
	    name = "Nickel";
	    value = 5;
	} else {
	    name = "Penny";
	    value = 1;
	}
    }

    public void setFlips(int n) {
	flips = n;
    }

    public void setHeads(int n) {
	heads = n;
    }

    public void setTails(int n) {
	tails = n;
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
    
    public String getName() {
	return name;
    }

    public int getValue() {
	return value;
    }

    public void Reset() {
      	setFlips(0);
	setHeads(0);
	setTails(0);
    }

    public void Face() {
    }


}
    
