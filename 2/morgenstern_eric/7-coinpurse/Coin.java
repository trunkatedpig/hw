import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int flips;
    private int heads;
    private int tails;
    public String name;
    private double value;
    private double fairness;
    public Coin() {
	face = "Heads";
	flips = 0;
	heads = 0;
	tails = 0;
	fairness = .5;
    }
    public Coin(String namer, double valuer){
	name = namer;
	face = "Heads";
	flips = 0;
	heads = 0;
	tails = 0;
	fairness = .5;
	value = valuer;
    }
    public String getFace() {
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
    public double getProb() {
	return fairness;
    }
    public void flip(){
	if( Math.random() < .5){
	    face = "Heads";
	    flips = flips + 1;
	    heads = heads + 1; 
	}
	else {
	    face = "Tails";
	    flips = flips + 1;
	    tails = tails + 1;
	}
    }
    public void changeProb(double x) {
	fairness = x;
    }
    public void reset(){
	flips = 0;
	heads = 0;
	tails = 0;
	face = "The coin has not yet been flipped";
    }
}

