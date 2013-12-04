import java.io.*;
import java.util.*;


public class Coin {

	private String face;
	private int heads;
	private int tails;
	private int numFlips;
	private double probability;
	public double coin;
	

	public Coin (double setProbability, String coinValue) {
		probability = setProbability;
		if (coinValue.equals("quarter")) {
		coin = 0.25; }
		else if (coinValue.equals("dime")) {
		coin = 0.10; }
		else if (coinValue.equals("nickel")) {
		coin = 0.05; }
		else if (coinValue.equals("penny")) {
		coin = 0.01; }
		
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
	public double getValue() {
	return coin;
	}

	














}