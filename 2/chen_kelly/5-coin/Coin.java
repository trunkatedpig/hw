import java.io.*;
import java.util.*;

public class Coin{
    //VARIABLES
    private String face;
<<<<<<< HEAD
    private int flips;
    private int heads;
    private int tails;
=======
    private int flips, heads, tails;
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
    private double fairness;


    //CONSTRUCTORS
    public Coin(){
<<<<<<< HEAD
	face = "heads";
=======
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
	flips = 0;
	heads = 0;
	tails = 0;
	fairness = 0.5;
<<<<<<< HEAD
=======
	face = "none";   
 }

    public Coin(double prob){
	face = "none";
	flips = 0;
	heads = 0;
	tails = 0;
	fairness = prob;
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
    }

    //METHODS
    public void resetFlips(){
	flips = 0;
<<<<<<< HEAD
=======
	heads = 0;
	tails = 0;
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
    }

    public String getFace(){
	return face;
    }

    public int getFlips(){
	return flips;
    }
<<<<<<< HEAD
=======

    public int getHeads(){
	return heads;
    }

    public int getTails(){
	return tails;
    }
    public void flipCoin(){
	double prob = Math.random();
	if (prob > fairness){
	    face = "heads";
	    heads = heads + 1;
		}
	else{
	    face = "tails";
	    tails = tails + 1;
		}
	flips = flips + 1;
    }
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
 
}
