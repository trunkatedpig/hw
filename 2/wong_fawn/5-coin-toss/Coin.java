import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int counts, heads, tails;
    private double probability;

    public Coin() {
	face = "heads";
	counts = 0;
	heads = 0;
	tails = 0;
	probability = 0.5;
    }
    public void resetCounts(){
	counts = 0;
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
	return counts;
    }
}