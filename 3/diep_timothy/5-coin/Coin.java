import java.io.*;
import java.util.*;

public class Coin {
    
    private String face;
<<<<<<< HEAD
    private int heads = 0;
    private int tails = 0;
    private int flips = 0;
    private double fairness;

    public Coin() {
	setFlips(0);
	setHeads(0);
	setTails(0);
    }
	
    public void setFlips(int n) {
	flips = n;
    }

    public void setHeads(int n) {
	heads = n;
    }

    public void setTails(int n) {
	tails = n;
    }

=======
    private int heads;
    private int tails;
    private int flips;
    private double fairness;

    public Coin() {
	flips = 0;
	heads = 0;
	tails = 0;
	fairness = 0.5;
    }
	
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
    public int getFlips() {
	return flips;
    }

    public int getHeads() {
	return heads;
    }

    public int getTails() {
	return tails;
<<<<<<< HEAD
    }

    public void Reset() {
      	setFlips(0);
	setHeads(0);
	setTails(0);
    }

    public void Face() {
    }


=======
    }    

    public void Reset() {
        flips = 0;
	heads = 0;
	tails = 0;
    }

    public String getFace() {
	Random r = new Random();
	if (r.nextDouble() >= fairness) {
	    face = "Heads";
	    heads = heads + 1;
	    flips = flips + 1;
	    return face;
       	} else {
	    face = "Tails";
	    tails = tails + 1;
	    flips = flips + 1;
	    return face;
       	}
    }
    //Coin and CoinPurse are in Hw#7
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
}
    
