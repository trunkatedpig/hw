import java.io.*;
import java.util.*;

public class Coin {
    
    private String face;
    private int heads = 0;
    private int tails = 0;
    private int flips = 0;
    private double fairness;

    public Coin() {
	setFlips(0);
	setHeads(0);
	setTails(0);
    }
	
    public void setFlips(int n) {
	flips = n;
    }

    public void setHeads(int n) {
	heads = n;
    }

    public void setTails(int n) {
	tails = n;
    }

    public int getFlips() {
	return flips;
    }

    public int getHeads() {
	return heads;
    }

    public int getTails() {
	return tails;
    }

    public void Reset() {
      	setFlips(0);
	setHeads(0);
	setTails(0);
    }

    public void Face() {
    }


}
    
