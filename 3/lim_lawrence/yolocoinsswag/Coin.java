import java.io.*;
import java.util.*;

public class Coin {
    //instance variables
    private int face=0;
    private int heads=0;
    private int tails=0;
    private double odds=0.50;
    private String name="Quarter";
    private double value=0.25;
    private Random rng = new Random();

    //get
    public int getFace(){return face;}
    public int getHeads(){return heads;}
    public int getTails(){return tails;}
    public int getFlips(){return heads+tails;}
    public double getOdds(){return odds;}
    public String getName(){return name;}
    public double getValue(){return value;}
 
    //set
    public void setFace(int pface){face=pface;}
    public void setHeads(int pheads){heads=pheads;}
    public void setTails(int ptails){tails=ptails;}
    public void setOdds(double podds){odds=podds;}

    //constructors
    public Coin() {
	setOdds(0.50);
    }
    public Coin(double podds) {
	setOdds(podds);
    }
    public Coin(String pname, double pvalue) {
	setOdds(0.50);
	name=pname;
	value=pvalue;
    }

    //methods
    public void flip() {
	if (rng.nextDouble() < odds) {
	    heads+=1;
	}
	else {
	    tails+=1;
	}
    }
    public void resetFlips() {
	setHeads(0);
	setTails(0);
    }
    public void print() {
	System.out.println("(-"+name+"-)");
	System.out.println("  Value: "+value);
	System.out.println("  Flips: "+getFlips());
	System.out.println("  Heads: "+heads);
	System.out.println("  Tails: "+tails);
	System.out.println("  Odds:  "+odds);
	System.out.println();
    }
}
