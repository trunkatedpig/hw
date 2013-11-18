import java.io.*;
import java.util.*;

public class Coin {
    private String face; //"heads" or "tails"
<<<<<<< HEAD
    private int flips, heads, tails;
    private int fairness; //percent of heads

    public void resetCounts(){
	flips = 0;
	heads = 0;
	tails = 0;
    }
    
=======
    private int tosses, heads;
    private double prob = 0.5; //percent of heads

    public void initcoin (String f, double p){
	face = f;
	tosses = 0;
	heads = 0;
	prob = p;
    }

    public Coin(){
	initcoin("Heads",0.5);
    }


    public Coin(String f) {
	initcoin(f,0.5);
    }

    public void resetCounts(){
	tosses = 0;
	heads = 0;
    }

>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
    public String getFace() {
	return face;
    }

<<<<<<< HEAD
=======
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
	}
    }
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
}
