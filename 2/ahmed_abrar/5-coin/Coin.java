import java.io.*;
import java.util.*;

public class Coin{
    private String face;
    private int flips, fairness, heads, tails;


    public void reset() {
	flips = 0;
	heads = 0;
	tails = 0;
    }

    public String getFace(){
	return face;
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
    
    public String flip() {
	flips += 1;
	Random r = new Random();
	if (r.nextInt()>0) {
	    heads += 1;
	    return "Heads";
	}
	else {
	    tails += 1;
	    return "Tails";
	}
    }

}
