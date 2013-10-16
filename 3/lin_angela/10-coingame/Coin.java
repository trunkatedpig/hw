import java.io.*;
import java.util.*;

public class Coin {

    private String face;
    private double fairness = 0.5;
    private double value;
    private String name;

    /*    public Coin(String name, double value){
	this.name = name; //this refers to instance variables
	this.value = value;
    }


    public Coin(){ ///different constructor that takes no parameters for flexiblity
	this.name = "Quarter"; //this refers to instance variables (vs. the parameter)
	this.value = 0.25;
    }
   
  
    public double getValue(){
	return value;
    }
    public String getName(){
	return name;
    }

    public void resetCount(){
	numOfFlips=0;
	numOfTails=0;
	numOfHeads=0;
	fairness=0.5;
    }
    */

    public String coinFlip(){
	Random r = new Random();
	double rannum = r.nextDouble();
	if (fairness >= rannum) {
	    face = "T";
	    }else {
	    face = "H";	   
	    }
	return face;
    }


    /* public int Flips(){
	return numOfFlips;
    }

    public int Heads(){
	return numOfHeads;
    }

   public String currentHead() {
       coinFlip();
       return face;
    }

    */








}
