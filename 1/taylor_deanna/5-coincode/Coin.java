import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    /*   private int heads;
    private int tails;
    private int totalflips;
    private int headpercent;

    public void resetCount() {
	totalflips = 0;
	heads = 0;
	tails = 0;
	fairness = 0;
	} */

    private boolean side;
    private int totalflips;
    private int heads;
    private int tails;
    private double percent;
    private double fairness;

    public Coin() {
	resetCount();
    }

    public void resetCount() {
	heads = tails = totalflips = 0;
	fairness = .5;
    }

    public void setCount() {
	if (Math.random() < fairness) {
	    side = true;
	    totalflips++;
	    heads++;
	}
	else {
	    side = false;
	    totalflips++;
	    tails++;
	}
    }

    public String getFace() {
	if (side) {
	    return "Heads";
	} else {
	    return "Tails";
	}
    }

    public int getTotalFlips() {
	return totalflips;
    }

    public int getHeads() {
	return heads;
    }

    public int getTails() {
	return tails;
    }
}
