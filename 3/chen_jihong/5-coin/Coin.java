import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int flips;
    private int heads;
    private int tails;
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
    }
		

    public String getFace (){
	return face;
    }
    public void coinReset(){
	flips = 0;
    }
    public int getFlips(){
	return flips;
	    }
}