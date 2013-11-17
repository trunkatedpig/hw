import java.io.*;
import java.util.*;

public class Coin{
    
<<<<<<< HEAD
    private String face;
    private int flipsh;
    private int fairness;

    public Coin(){
	face = "heads";
	flipsh = 0;
	fairness = 0;
=======
    private String face,name;
    private int flipsh;
    private int heads;
    private double fairness;
    private double value;
    
    public Coin(String cName){
	init();
	name = cName;
	if (cName.equals("dime")) {
	    value = 0.1;
	}
	else if (cName.equals("penny")) {
	    value = 0.01;
	}
	else if (cName.equals("quarter")) {
	    value = .25;
	}
	else if (cName.equals("dollar")){
	    value = 1;
	}
	else if (cName.equals("nickel")) {
	    value = 0.05;
	}
    }

    public Coin(){
	init();
    }
    private void init() {
     	face = "heads";
	flipsh = 0;
	fairness = 0.5;
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
    }

    public void reset() {
	flipsh = 0;
<<<<<<< HEAD
    }

    public String getFace(){
	return face;
    }
=======

    }
    
    
    public double getValue() {
	return value;
    }
    public String getFace(){
	return face;
    }
    public void flip() {
	flipsh = flipsh + 1;
        double prob;
	prob = Math.random();
	if (prob > fairness) {
	    face = "heads";
	    heads = heads + 1;
	}else{
	    face = "tails";
	}
    }
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
}
