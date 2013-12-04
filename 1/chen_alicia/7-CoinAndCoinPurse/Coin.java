import java.io.*;
import java.util.*;

public class Coin {
    private String face,name; //face = "heads" or "tails"
    private int heads, tails,  tosses;
    private double coinvalue,  prob = 0.5; //percent of heads

    public void initcoin (String f, double p){
	face = f;
	tosses = 0;
	heads = 0;
	prob = p;
    }

    public Coin(){
	initcoin("Heads",0.5);
    }

    public Coin(String n){
	name =n;
	if (n == "penny") {
	    coinvalue = 0.01;
		}
	else if (n == "nickel"){
	    coinvalue = 0.05;
	}
	else if (n== "dime"){
	    coinvalue = 0.1;
	}
	else if (n=="quarter"){
	    coinvalue = 0.25;
	}
    }

 public Coin(double v){
	coinvalue = v;
	if (v == .01){
	    name = "penny";
	}
	else if (v == .05){
	    name = "nickel";
	}
	else if (v == .1){
	    name = "dime";
	}
	else{
	    name = "quarter";
	}
 }

    public void reset(){
	face ="heads";
	name = "penny";
	tosses = 0;
	tails = 0;
	heads = 0;
	coinvalue = 0.01;
	prob = 0.5;
    }
	

    public void resetCounts(){
	tosses = 0;
	tails = 0;
	heads = 0;
    }

    public String getFace() {
	return face;
    }

    public double getValue() {
	return coinvalue;
    }
    public String getName() {
	return name;
    }

    public boolean equals(Coin other) {
	return face.equals(other.getFace());
    }

    public void flip() {
	double random=Math.random()+.1;
	tosses +=1;
	if (random >= prob){
	    face= "heads";
	    heads += 1;
	}
	else {
	    face="tails";
	    tails += 1;
	}
    }
}
