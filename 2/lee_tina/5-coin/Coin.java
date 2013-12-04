import java.io.*;
import java.util.*;

public class Coin { 
    private String face;
    private String face1;
    private String face2;
    private int numflips;
    private int numheads;
    private int numtails;
    private int fairness;

    public Coin(){
	face = "tails";
    }
    
    public void resetCount(){
	numflips = 0;
	numheads = 0;
	numtails = 0;
    }

    public String getFace(){
	return face;
    }
    
    public String flipCoin(){
	fairness = (int)(Math.random() * 100);
	if (fairness < 50){
	    face = "heads";
	    numheads++;
	}
	else{
	    face = "tails";
	    numtails++;
	}

	numflips++;

	return face;
    }
    
    public boolean coinsEqual(){
	face1 = flipCoin();
	face2 = flipCoin();
	return face1.equals(face2);
    }

}
    
