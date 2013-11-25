import java.io.*;
import java.util.*;

public class Coin {
    private String face;
<<<<<<< HEAD
    private int h,t,f
    private double p;
	/*where h=heads, t=tails, f=flips, and p=percent heads*/

    public void resetCount(){
	h=0;
	f=0;
	t=0;
	p=0;
    }
    public void getFace(){
	return face;
=======
    private int heads,tails,flips;
    private double fairness;

    public Coin(){
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

>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
    }

}
