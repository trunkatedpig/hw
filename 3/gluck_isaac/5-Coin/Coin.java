<<<<<<< HEAD
public class Coin {
    public String face;
    public int count;
    public int prob;

    /*
    public Coin() {
	
    }
    */

    public void setCount(int n) {
	count = n;
    }

    public void resetCount() {
	setCount(0);
=======
import java.util.*;
import java.io.*;

public class Coin {
    private String face, name;
    private int tosses, heads;
    private double prob, value;
    
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

    public void setName(String n) {
	name = n;
    }
    public void setValue(double v) {
	value = v;
    }
    public Coin(String name, double value) {
	initCoin("Heads", 0.5);
	setName(name);
	setValue(value);
	
    }

    public void resetCount() {
	tosses = 0;
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
    }

    public String getFace() {
	return face;
    }
<<<<<<< HEAD
=======

    public double getValue() {
	return value;
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
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
}
