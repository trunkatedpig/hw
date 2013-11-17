import java.io.*;
import java.util.*;

public class Coin {
    private String face;
<<<<<<< HEAD
    private int outcomeHeads, outcomeTails, fairness;
=======
    private int outcomeHeads, outcomeTails, outcomeTotal;
    private double fairness=0.0;
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
    
    public void resetCount(){
	outcomeHeads=0;
	outcomeTails=0;
    }
    public String getFace(){
	return face;
    }
<<<<<<< HEAD
=======
    public String coinFlip(){
	int r = (int )(Math.random() * 100 + 1);
	if (r > fairness* 100.0) face = "tails";
	else face = "heads";
	return face;
    }
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
}