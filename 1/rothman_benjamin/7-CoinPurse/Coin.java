import java.io.*;
import java.util.*;


public class Coin {
    private String face;
    private String name;
    private int flips;
    private int heads;
    private int tails;
    private double prob;
    private double value;
    private int random; 

    public void initCoin(String f, Double v) {
	name = f;
	face = "Heads" ;
	heads=0;
	tails = 0;
	flips = 0;
	prob= .5 /* 50/50 chance of it going either way to start*/;
	value = v;
    }


    public Coin (String s, Double v) {
	initCoin(s,v);
    }



    public void reset () {
	flips = 0;
	    heads = 0;
	    tails = 0;
	    prob = .5;

	    }


    public void setFaceHeads() {
	face = "Heads";
	flips += 1;
	heads += 1;
	setProb();

    }

    public void setFaceTails () {
	face = "Tails";
	flips += 1;
	tails += 1;

	setProb();


    }

    public void setProb () {

	prob = (heads / (heads + tails) );
    }


    public void flip () {

	Random r = new Random();
	
	random = r.nextInt (2);

	if (random == 1) {
	    setFaceHeads ();

	}

	else {
	      setFaceTails();

	      }
    }

	












    /* RETURN SECTION */

    public double getValue() {
	return value;
    }

  public String getFace() {
	return face;
    }


    public int getFlips () {
	return flips;
    }


    public String getName() {
	return name;
    }

    public double getProb () {

	return prob;

    }

}





    




