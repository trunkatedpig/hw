import java.util.*;
import java.io.*;

public class Coin {
    public String face;
    public int tosses;
    public int heads;
    public double prob;
    
    public void initCoin(String f, double p) {
	setFace(f);
	tosses = 0;
	heads = 0;
	setProb(p);
    }
    public void setFace(String f) {
	face = f;
    }

    public void setProb(double p) {
	prob = p;
    }

    public Coin() {
        initCoin("Heads", 0.5);
    }

    public void resetCount() {
	tosses = 0;
    }

    public String getFace() {
	return face;
    }
    
    public boolean equals(Coin other) {
	return face.equals(other.getFace());
    }

    public String flip() {
	Random r = new Random();
	int a = r.nextInt(2);
	if (a == 1) {
	    tosses = tosses + 1;
	    heads = heads + 1;
	    setFace("Heads");
	    double newProb = ((double) heads) / tosses;
	    setProb(newProb);
	    return face;
	} else {
	    tosses = tosses + 1;
	    setFace("Tails");
	    double newProb = ((double) heads) / tosses;
	    setProb(newProb);
	    return face;
	}
    }
}
