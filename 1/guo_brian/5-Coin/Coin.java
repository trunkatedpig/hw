import java.io.*;
import java.util.*;

public class Coin{

<<<<<<< HEAD
    public String Face;
    public static int flips, percentage, heads, tails;

    public void reset() {
	flips = 0;
	percentage = 0;
=======
    public String Face, Name;
    public int flips, heads, tails;
    public double percentage, amount;

    public void reset() {
	flips = 0;
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
	heads = 0;
	tails = 0;
    }

<<<<<<< HEAD
    public void face(String a) {
	Face = a;
=======
    public void setFace(String f){
	Face = f;
    }
    
    public void setPercentage (double d) {
	percentage  = d;
    }

    public Coin () {
	setFace ("heads");
	setPercentage (.50);
	setName("Quarter");
	setAmount(.25);
    }

    public Coin (String name, String face, double d, double a) {
	setFace (face);
	setPercentage (d);
	setName (name);
	setAmount(a);
    }
    
    public Coin (String h, double d) {
	setFace (h);
	setPercentage (d);
    }
    
    public void setAmount (double d) {
	amount = d;
    }

    public void setName(String n) {
	Name = n;
    }

    public void Flip () {
	double r;
	r = Math.random();
	if (r < percentage){
	    setFace ("tails");
	    tails = tails + 1;
	}
        else {
	    setFace("heads");
	    heads = heads + 1;
	}
	flips = flips + 1;
    }

    public String getName() {
	return Name;
    }
    
    public double getAmount () {
	return amount;
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
    }
}
