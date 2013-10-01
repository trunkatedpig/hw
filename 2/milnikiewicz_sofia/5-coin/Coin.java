import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int flips,heads,tails,fairness;

    public Coin() {
	face = "heads";
	flips = 5;
	heads = 2;
	tails = 3;
	fairness = 40;
    }

    public void reset() {
	flips = 0;
	heads = 0;
	tails = 0;
	fairness = 0;
	
    }

    public String getFace() {
    	return face;
	   
    }
    
}






