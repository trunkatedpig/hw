import java.io.*;
import java.util.*;

public class Coin {
    
    private String faceValue;
    private int heads, tails, flips;
    private double probhead = 0.5;
    
    public void resetCount(){
	flips = 0;
	heads = 0;
	tails = 0;
    }

    Random r;
    r = new Random();

    public void setFace(){
	if ((r.nextDouble()) <= probhead)
	    faceValue ="Heads";
	else
	    faceValue ="Heads";
    }
}