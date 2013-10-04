import java.io.*;
import java.util.*;

public class Coin {

    private String face;
    private int flips, heads, tails, fairness;

    public Coin() {
	face = "Heads";
	flips = 5;
	heads = 3;
	tails = 2;
    }
    public void reset() {
	    flips = 0;
	    heads = 0;
	    tails = 0;
	}
    public String getFace() {
	return face;
    }
    public int getFlips() {
	return flips;
    }
}