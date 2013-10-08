import java.io.*;
import java.util.*;

public class Coin {
    private String face,name;
    private int heads,tails,flips;
    private double fairness,value;

    public Coin(){
	face="heads";
        flips=0;
        heads=0;
        tails=0;
	fairness= 50.0;
	name="quarter";
	value=0.25;
    }
    public Coin(String n,double v){
	name=n;
	value=v;
	face="heads";
        flips=0;
        heads=0;
        tails=0;
	fairness= 50.0;
    }
    
    public void reset() {
        flips = 0;
        heads = 0;
        tails = 0;
        fairness = 50.0;

    }
    
    public double getValue(){
	return value;
    }

    public String getFace() {
        return face;

    }

    public double getFairness() {
        return fairness;

    }

    public void flip() {
        int random = (int)(Math.random() * 100 + 1);
	if (random <= fairness)
            face = "heads";

        else
            face = "tails";

    }

    public void setFairness(double i){
        fairness = fairness + i;

    }

}
/*Sofia M. and I were partners and worked on some of this together*/
