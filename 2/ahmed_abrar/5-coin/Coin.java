import java.io.*;
import java.util.*;

public class Coin{
    private String face;
<<<<<<< HEAD
    private int flips, fairness;
=======
    private int flips, fairness, heads, tails;
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3


    public void reset() {
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

    public int getFlips() {
	return flips;
    }
    
<<<<<<< HEAD
    public String flip() {
	flips += 1;
	return "Heads";
=======
    public int getHeads() {
	return heads;
    }

    public int getTails() {
	return tails;
    }
    
    public String flip() {
	flips += 1;
	Random r = new Random();
	if (r.nextInt()>0) {
	    heads += 1;
	    return "Heads";
	}
	else {
	    tails += 1;
	    return "Tails";
	}
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
    }

}
