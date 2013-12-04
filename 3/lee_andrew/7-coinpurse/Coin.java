import java.io.*;
import java.util.*;

public class Coin {
    private String face,name;
    private int tosses,heads,tails;
    private double prob = 0.5;
    private double value;

    public void initCoin(String f, double p){
	face = f;
	tosses = 0;
	heads = 0;
	tails = 0;
	prob = p;
    }

    public Coin() {
	initCoin("Heads",0.5);
    }
    
    public Coin(String n, double v) {
	initCoin("Heads",0.5);
	name = n;
	value = v;
    }

    public Coin(String f) {
	initCoin(f,0.5);
    }
    
    public void flip() {
	if (Math.random() < prob) {
	    face = "Heads";
	    tosses = tosses + 1;
	    heads = heads + 1;
	}
	else {
	    face = "Tails";
	    tosses = tosses + 1;
	    tails = tails + 1;
	}
    }
    
    public void resetCount() {
	tosses = 0;
    }

    public String getFace() {
	return face;
    }
    
    public int getTosses() {
	return tosses;
    }
    
    public int getHeads() {
	return heads;
    }

    public int getTailes() {
	return tails;
    }

    public double getValue() {
	return value;
    }

    public boolean equals(Coin other) {
	return face.equals(other.getFace());
    }
}