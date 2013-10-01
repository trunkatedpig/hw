import java.io.*;
import java.util.*;

public class Coin {
    
    private String face;
    private int heads, tails, flips;
    private double fairness;
    
    public void reset() {
	face = "Not Flipped";
	heads = 0;
	tails=0;
	flips=0;
	fairness=0;
    }

    public String getFace() {
	return face;
    }
	  
}
    
