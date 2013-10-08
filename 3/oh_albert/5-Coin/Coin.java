import java.io.*;
import java.util.*;

public class Coin {
    
    private String faceValue;
    private int heads, tails, flips;
<<<<<<< HEAD
    private double probhead = 0.5;
    Random r = new Random();
    
    public void resetCount(){
	flips = 0;
	heads = 0;
	tails = 0;
    }

    public void setFace(){
	if ((r.nextDouble()) <= probhead)
	    faceValue ="Heads";
	else
	    faceValue ="Heads";
    }
}
=======
    private double probHead = 0.5;
    private int coinValue;
    private String coinName;

    public void resetValues(String f, Double p) {
	heads = 0;
	tails = 0;
	flips = 0;
	faceValue = f;
	probHead = p;
	coinValue = 0;
    }

    public Coin() {
	resetValues("Heads",0.5);
    }

    public Coin(String f) {
	resetValues(f,0.5);
    }
    
    public String getFace() {
	return faceValue;
    }

    public Coin (String coinname, int coinval) {
	coinName = coinname;
	coinValue = coinval;
    }

    public int money () {
	return coinValue;
    }

}
>>>>>>> 5573214aa8da6d79c2ba503223a0dce0fbf8c8b5
