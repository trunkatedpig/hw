import java.io.*;
import java.util.*;

public class Coin {
    private int face=0;
    private int heads=0;
    private int tails=0;
    private double odds=0.50;
    private String name="Quarter";
    private double value=0.25;
    private Random rng=new Random();

    
    public int getFace(){return face;}
    public int getHeads(){return heads;}
    public int getTails(){return tails;}
    public int getFlips(){return heads+tails;}
    public double getOdds(){return odds;}
    public String getName(){return name;}
    public double getValue(){return value;}
 
    //other values
    public void setFace(int oface){face=oface;}
    public void setHeads(int oheads){heads=oheads;}
    public void setTails(int otails){tails=otails;}
    public void setOdds(double oodds){odds=oodds;}

    
    public Coin() { }
    public Coin(double oodds) {odds=oodds;}
    public Coin(String oname, double ovalue) {
	odds=0.50;
	name=oname;
	value=ovalue;
    }

    //simple flippin'
    public void flip() {
	if (rng.nextDouble() < odds) {face=0;heads+=1;}
	else {face=1;tails+=1;}
    }
    public void resetFlips() {
	setHeads(0);
	setTails(0);
    }
    public void print() {
	System.out.println("("+name+")");
	System.out.println("  Value is "+value);
	System.out.println("  Flips total is  "+getFlips());
	System.out.println("  Heads total is "+heads);
	System.out.println("  Tails total is  "+tails);
	System.out.println("  The Odds are  "+odds);
	System.out.println();
    }
}
