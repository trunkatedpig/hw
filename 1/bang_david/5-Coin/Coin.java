import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int flips, heads, tails;
<<<<<<< HEAD
    private int fairness;
=======
    private double fairness;
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3

    public void resetCount (){
        setFace ("");
	setHeads (0);
	setTails (0);
<<<<<<< HEAD
=======
	setFlips (0);
	setFairness (0.0);
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
    }

    public void setFace (String f) {
	face = f;
    }
    public void setHeads (int h) {
	heads = h;
    }    

    public void setTails (int t) {
        tails = t;
    }
<<<<<<< HEAD
    public String getFace () {
	return face;
    }
=======
    public void setFlips (int w) {
	flips = w;
    }

    public void setFairness (double u) {
	fairness = u;
    }    
 /* fairness will be from 0 to 100 percent, can add in decimals too to make more precise */
    public String getFace () {
	return face;
    }

    public int getFlips () {
	return flips;
    }

    public int getHeads () {
	return heads;
    }

    public int getTails () {
	return tails;
    }
    public double getFairness () {
	return fairness;
    }


    public void coinFlip () {
	double r;
      	r = Math.random ();
	double r2 = r * 100;
	if (r2 <= fairness) {
	    setFace ("Heads");
	    setHeads (heads + 1);
	    setFlips (flips + 1);
	 
	}

	else {
	    setFace ("Tails");
	    setTails (tails + 1);
	    setFlips (flips + 1);
	}
	
    }
    public void FlipxTimes (int x) {

        coinFlip ();
        x = x - 1;
	
	if (x > 0) {
	    FlipxTimes (x) ;
 
	    
	}

    }
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
}
