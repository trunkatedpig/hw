import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int flips;
    private int heads;
    private int tails;
    private double fairness;

    public void Coin() {
	face = "heads";
        flips = 0;
	heads = 0;
	tails = 0;
	fairness = 0.5;
    }

    public void flip() {
	Random generator = new Random();
	double r = generator.nextDouble();
	if (r < 0.5){
		face = "heads";
		heads = heads + 1;
		flips = flips + 1;
	    } else {
	    face = "tails";
	    tails = tails + 1;
	    flips = flips + 1;
	}
    }
    
    public String getFace() {
	return face;
    }
    
    public int getFlips() {
	return flips;
    }
    





}
