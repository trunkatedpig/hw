import java.io.*;
import java.util.*;



public class Coin {

    public String face;
    public int flips,heads,tails;
    public double fairness;

   
    
    public void resetCounter() {
	flips = 0;
	//Do you also need to reset heads and tails or just flips?
	heads = 0;
	tails = 0;
    }
    
    public String getface() {
	return face;
    }
	   
}
