import java.io.*;
import java.util.*;

public class Coin {

    private String heads;
    private int countH;
    private int countT;
    private double fairness, amount;
    private Random r = new Random();
    private String type;

    public Coin() {
	heads = "Heads";
	type = "penny";
	amount = 0.01;
	fairness = 0.5;
}
    public Coin(double value) {
	heads = "Heads";
	fairness = 0.5;
	type = whatType(value);
	amount = value;
    }

    // GETTERS
    public int getHeads() {
	return countH;
    }
    public int getTails() {
	return countT;
    }
    public int getFlips() {
	return countH + countT;
    }
    public String getType() {
	return type;
    }
    public double getAmount() {
	return amount;
    }
    public double getFairness() {
	return fairness;
    } 	    
    public String getFace() {
	return heads;
    }

    //SETTERS
    public String setFace(String face) {
	if (face == "heads" || face == "tails" || face == "Heads" || face == "Tails" || face == "HEADS" || face == "TAILS") {
	    heads = face;
	    return "Note that setting the face directly does not affect 'countH' or 'countT'";
	}
	else {
	    return "Sorry but" + face + "is not a valid input; must be heads or tails";
	}
    }
    public void setFairness(double n) {
	fairness = n;
    }
    public void setAmount(double value){
	amount = value;
	type = whatType(value);
    } 

    //MISCELLANEOUS
    public String whatType(double value){
	if (value == 0.005) {
	    return "hapne";
	}
	else if (value == 0.01) {
	    return "penny";
	}
	else if (value == 0.02) {
	    return "tupence";
	}
	else if (value == 0.05) {
	    return "nickel" ;
	}
	else if (value == 0.1) {
	    return "dime";
	}
	else if (value == 0.25) {
	    return "quarter" ;
	}
	else if (value == 0.5) {
	    return "half-dollar";
	}
	else if (value == 1.0) {
	    return "silver dollar";
	}
	else {
	    return "coin";
	}
    }

    public void flip() {
	if (r.nextBoolean()) {
	    heads = "Heads";
	    countH += 1;
	}
	else {
	    heads = "Tails";
	    countT += 1;
	}
    }

    public void reset () {
	countH = 0;
	countT = 0;
    }
}