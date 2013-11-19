import java.io.*;
import java.util.*;

public class Coin {
    private String face;
<<<<<<< HEAD
    private int heads, tails, totalflips, headpercent;
=======
    /*   private int heads;
    private int tails;
    private int totalflips;
    private int headpercent;
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3

    public void resetCount() {
	totalflips = 0;
	heads = 0;
	tails = 0;
<<<<<<< HEAD
	headpercent = 0;
    }

    public String getFace() {
	return face;
    }

    public void setCount() {
	totalflips = 5;
	heads = 2;
	tails = 3;
	headpercent = 20;
=======
	fairness = 0;
	} */

    private boolean side;
    private int totalflips;
    private int heads;
    private int tails;
    private double percent;
    private double fairness, amount;

    public Coin() {
	resetCount();
    }

    public void resetCount() {
	heads = tails = totalflips = 0;
	fairness = .5;
	amount = 50;
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
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
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
<<<<<<< HEAD

    public int getHeadPercent() {
	return headpercent;
    }
=======
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
}
