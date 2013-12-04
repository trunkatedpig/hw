import java.io.*;
import java.util.*;

public class Coin {
    
    private String face;
    private int heads;
    private int tails;
    private int flips;
    private double fairness;

    public Coin() {
	flips = 0;
	heads = 0;
	tails = 0;
	fairness = 0.5;
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

    public void Reset() {
        flips = 0;
	heads = 0;
	tails = 0;
    }

    public String getFace() {
	Random r = new Random();
	if (r.nextDouble() >= fairness) {
	    face = "Heads";
	    heads = heads + 1;
	    flips = flips + 1;
	    return face;
       	} else {
	    face = "Tails";
	    tails = tails + 1;
	    flips = flips + 1;
	    return face;
       	}
    }
}
