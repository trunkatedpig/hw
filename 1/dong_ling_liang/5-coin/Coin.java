import java.io.*;
import java.util.*;

public class Coin{
   
    private String face;
    private int flips, heads, tails;
    private double fairness;
    private Random r = new Random();
    private double amount;
    private String type;

    public Coin() {
	fairness=0.5;
	face="heads";
	amount=0.01;
	type= "penny";
    }
    public Coin(String t, double a){
    	face="heads";
    	fairness=0.5;
    	type=t;
    	amount=a;
    }
    public Coin(String t){
    	face="heads";
    	fairness=0.5;
    	type=t;
    	if (t.equals("dime")) {
	    value = 0.1;
	}
	else if (t.equals("penny")) {
	    value = 0.01;
	}
	else if (t.equals("quarter")) {
	    value = .25;
	}
	else if (t.equals("dollar")){
	    value = 1;
	}
	else if (t.equals("nickel")) {
	    value = 0.05;
    	}
    }

    public void reset(){
        flips=0;
	heads=0;
	tails=0;
	fairness=0.5;
	face="heads";
	    }

    public String currentFace(){
	return face;
    }

    public void setAmount(double n) {
	amount = n;
    }

    public void setFairness(double n){
	fairness = n;
    }

    public int getHeads() {
	return heads;
    }

    public int getTails() {
	return tails;
    }

    public double getAmount() {
	return amount;
    }

    public void flip(){
	if (r.nextDouble() < fairness){
	    face="heads";
	    flips=flips+1;
	    heads=heads+1;
	}
	else {
	    face="tails";
	    tails=tails+1;
	    flips=flips+1;
	}
    }
}
