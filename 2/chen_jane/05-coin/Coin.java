import java.io.*;
import java.util.*;

public class Coin {

    private String face;
    private int flips,heads,tails;
    private double fairness;

    public void resetCount() {
	flips = 0;
	heads = 0;
	tails = 0;
    }

    public void setFairness(double n) {
	fairness = n;
    }

    public void setFace() {
	face = "heads";
    }
    public void setFace(String tails) {
	face = "tails";
    }

    public String getFlips() {
	return "Number of flips: " + flips;
    }

    public String getFaces() {
	return "Current face: " + face + "\n"
	    + "Number of heads: " + heads + "\n"
	    + "Number of tails: " + tails + "\n";
    }

    public void flip() {
	if (Math.random() <= fairness) {
		face = "heads";
		heads = heads + 1;
	    }
	else {
	    face = "tails";
	    tails = tails + 1;
	}
	flips = flips + 1;
	
    }
}