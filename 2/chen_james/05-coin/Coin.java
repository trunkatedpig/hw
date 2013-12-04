import java.io.*;
import java.util.*;

public class Coin {

	private String face;
	private int heads;
	private int tails;
	private int numFlips;
	private double probability;
	
	public Coin (double setProbability) {
		probability = setProbability;
	}
	
	public void flip() {
		numFlips += 1;
		Random r = new Random();
		if (r.nextDouble() >= probability) {
			heads += 1;
			face = "heads";
		}
		else { 
			tails += 1;
			face = "tails";
		}	
	}
	
	public void reset () {
		numFlips = 0;
		heads = 0;
		tails = 0;
	}
	
	public String getFace () {
		return face;
	}
	public int getCounts () {
		return numFlips;
	}
	public int getHeads () {
		return heads;
	}
	public int getTails () {
		return tails;
	}
	














}