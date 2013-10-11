import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int flips;
    private int heads;
    private int tails;
<<<<<<< HEAD
    private double fair;

    public void  Coin(double Fair) {
	face = "Heads";
	flips = 0;
	heads = 0;
	tails = 0;
	fair = Fair;
    }
    
    public void flip() {
        Random r = new Random();
	if (double r < 0.5) {
		face = "Heads";
		flips = flips + 1;
		heads = heads + 1;
	}
	     else {
		face = "Tails";
		flips = flips +1;
		tails = tails +1;
	     }
=======
    private double fairness;

    public void Coin() {
	face = "heads";
        flips = 0;
	heads = 0;
	tails = 0;
	fairness = 0.5;
>>>>>>> a747c384620a6f4f21eab31fbfbc81f81cf82dc8
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
