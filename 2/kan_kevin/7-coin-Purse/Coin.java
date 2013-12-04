import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int flips, heads, tails;
    private double fairness;
    /*--------*/
    private int worth;

    public Coin(String type){
	face = "heads";
	flips = 0;
	heads = 0;
	tails = 0;
	fairness = .5;
	if (type.equals("quarter")){
		worth = 25;}
	else if (type.equals("dime")){
		worth = 10;}
	else if (type.equals("nickel")){
		worth = 5;}
	else if (type.equals("penny")){
		worth = 1;}
    }

    public void resetCount(){
	flips = 0;
    }
    public int getFlips(){
	return flips;
    }
    public String getFace(){
	return face;
    }
    public int getWorth(){
	return worth;
    }

    public void flip(){
	Random r = new Random ();
	flips = flips + 1;
	if (r.nextDouble() > fairness){
	    face = "heads";
	    heads = heads + 1;}
	else if (r.nextDouble() <= fairness){
	    face = "tails";
	    tails= tails + 1;}
    }
    public String getAll(){
	return "\nFace = " + face + "\nFlips = " + Integer.toString(flips) + "\nnumHeads = " + Integer.toString(heads) + "\nnumTails = " + Integer.toString(tails) + "\nCoin is worth: " + Integer.toString(worth);
    }

}
