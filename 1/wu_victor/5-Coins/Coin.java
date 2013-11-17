import java.io.*;
import java.util.*;

public class Coin {
<<<<<<< HEAD
    
    private String face;
    private int count;
    private int heads;
    private int tails;
    private int probHeads;

    public void resetCount () {
	setCount(0);
    }

    public void setCount (int a) {
	count = a;
    }

    public String getFace () {
	String f;
	f = face + " ";
	return f;
=======

    // Instance Variables

    private String face;
    private String name;
    private double prob;
    private int flips;
    private int heads;
    private int value;

    // Constructors

    public void setCoin (String f, Double p) {
	face = f;
	prob = p;
	name = "Random";
	value = 1;
    }

    public Coin () {
	setCoin ("Heads", 0.5);
    }
    public Coin (String f) {
	setCoin (f, 0.5);
    }
    public Coin (int v) {
	if (v == 1) {
	    name = "Penny";
	    value = v;
	}
	else if (v == 5) {
	    name = "Nickel";
	    value = v;
	}
	else if (v == 10) {
	    name = "Dime";
	    value = v;
	}
	else {
	    name = "Quarter";
	    value = 25;
	}
      
    }

    // Flip

    public void flip () {
	Random r = new Random();
	prob = r.nextDouble();

       	if ( prob > 0.5 ) {
	    setFace("Heads");
	    flips = flips + 1;
	    heads = heads + 1;
	}
	else {
	    setFace("Tails");
	    flips = flips + 1;
	}
    }

    // Helper Functions

    public void setFace (String f) {
	face = f;
    }
    public void resetFlips () {
	flips = 0;
    }

    // Return Methods

    public String getFace () {
	return face;
    }
    public String getName () {
	return name;
    }
    public String getValue () {
	String n;
	n = value + " " + "Cents";
	return n;
    }
    public int getV () {
	return value;
    }
    public int getFlips () {
	return flips;
    }
    public int getHeads () {
	return heads;
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
    }
}
