import java.io.*;
import java.util.*;

public class Coin {
    private String heads;
    private int countH;
    private int countT;
    private double fairness;
    private Random r = new Random();

    public Coin() {
	heads = "Heads";
}

    public int getHeads() {
	return countH;
    }
    public int getTails() {
	return countT;
    }
    public String getFace() {
	return heads;
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