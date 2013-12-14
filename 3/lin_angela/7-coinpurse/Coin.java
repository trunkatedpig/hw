import java.io.*;
import java.util.*;

public class Coin {

    private String face;
    private int numOfFlips;
    private int numOfTails;
    private int numOfHeads;
    private double fairness;
    private double value;
    private String name;

    public Coin(String name, double value){
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

    public void coinFlip(){
	Random r;
	r = new Random();
	if (fairness >= r.nextDouble()) {
		numOfHeads+=1;
		numOfFlips+=1;
	    }else {	   
	    numOfFlips+=1;
	    numOfTails+=1;	}
    }


    public int Flips(){
	return numOfFlips;
    }

    public int Heads(){
	return numOfHeads;
    }

   public String currentHead() {
       face="Heads";
     return face;
    }










}
