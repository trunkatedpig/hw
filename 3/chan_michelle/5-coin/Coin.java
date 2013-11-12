import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int flips;
    private int heads;
    private int tails;
    private int fairness;
    
    public Coin (String x) {
	face = x;
    }

    public void resetCounts(){
	flips = 0;
    }
    
    public String getFace() {
	return face;
    }
}

    
    
