import java.io.*;
import java.util.*;


public class Coin {
    private String face;
    private int tosses;
    private int heads;
    private double prob = 0.5; // another way to initialize
    private int random; 

    public void initCoin(String f, Double p) {
	face = f;
	tosses=0;
	heads=0;
	prob=p;
    }


    public Coin() {
	initCoin("Heads",0.5);
	    random = new nextInt (2);
    }


    public Coin(String f) {
	initCoin(f,0.5);
    }

    public String getFace() {
	return face;
    }



    public String Flip () {

	

	if (random == 1) {
	    face = "Heads";
	}
	
	else {
		face = "Tails";

    }
    }

		   

    public boolean sameFace(Coin other) {
	// complete this method
	return false ; // placeholder

    }
    
}
