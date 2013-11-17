import java.io.*;
import java.util.*;

public class Coin {
    private int face;
    private int heads;
    private int tails;
    private double weight;
<<<<<<< HEAD
=======
    private double value;
    private String name;
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3

    public Coin() {
	heads = 0;
	tails = 0;
<<<<<<< HEAD
	weight = 0.5;
=======
	face = 0; //Starts Heads
	weight = 0.5; //0 = Always Heads, 1 = AlwaysTails, 0.5 = Fair Coin, etc.
	value = .01;
	name = "Penny";
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
    }

    public Coin(double weight) {
	this.weight = weight;
	heads = 0;
	tails = 0;
<<<<<<< HEAD
=======
	face = 0;
	value = 0.1;
	name = "Penny";
    }

    public Coin(double weight, double value, String name) {
	this.weight = weight;
	this.value = value;
	this.name = name;
	heads = 0;
	tails = 0;
	face = 0;
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
    }

    public void reset() {
	heads = 0;
	tails = 0;
<<<<<<< HEAD
    }

    public String getFace() {
	if (face == 0) {
	    return "Heads";
	}
	else {
	    return "Tails";
	}
=======
	face = 0;
    }

    public String getFace() {
	if (face == 0)
	    return "Heads";
	else
	    return "Tails";
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
    }

    public int getCount() {
	return heads + tails;
    }

    public int getHeads() {
	return heads;
    }

    public int getTails() {
	return tails;
    }

    public double getWeight() {
	return weight;
    }

<<<<<<< HEAD
=======
    public double getValue() {
	return value;
    }

    public String getName() {
	return name;
    }

>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
    public void setWeight(double weight) {
	this.weight = weight;
    }

<<<<<<< HEAD
=======
    public void setName(String name) {
	this.name = name;
    }

    public void setValue(double value) {
	this.value = value;
    }

>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
    public void roll() {
	double rand = Math.random() - 0.5 + weight;
	face = (int) Math.round(rand);
	if (face == 0) {
	    heads ++;
	}
	else {
	    tails ++;
	}
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
