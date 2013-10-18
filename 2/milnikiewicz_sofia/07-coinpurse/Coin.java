import java.io.*;
import java.util.*;

public class Coin {
    private String face,name;
    private int flips,heads,tails;
    private double fairness,value;

    public Coin() {
        face = "heads";
        flips = 0;
        heads = 0;
        tails = 0;
        fairness = 50.0;
	name = "quarter";
	value = 0.25;
    }

    public Coin(String namee) {
	face = "heads";
	flips = 0;
	heads = 0;
	tails = 0;
	fairness = 50.0;
	name = namee;
        if (name == "quarter"){
	    value = 0.25;
	}
	if (name == "dime"){
	    value = 0.10;
	}
	if (name == "nickel"){
	    value = 0.05;
	}
	if (name == "penny"){
	    value = 0.01;
	}
	     
	
	 
    }

    public void reset() {
        flips = 0;
        heads = 0;
        tails = 0;
        fairness = 50.0;

    }

    public String getFace() {
        return face;

    }

    public double getFairness() {
        return fairness;

    }

    public double getValue() {
        return value;

    }

    public String getName() {
        return name;

    }

    public void flip() {
        int random = (int)(Math.random() * 100 + 1);
	if (random <= fairness)
            face = "heads";

        else
            face = "tails";

    }

    public void setFairness(double i){
        fairness = fairness + i;

    }

}

