import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int flips;
    private int heads;
    private double fair;

    public void reset(String f,Double Fair) {
	face = f;
	flips = 0;
	heads = 0;
	fair = Fair;
    }

    public void flip() {
	Random r = new Random();
	int d = r.nextInt(100);
	if (d < 50) {
	    face = "Heads";
	    heads = heads + 1; }
	else
	    face = "Tails";
	flips = flips + 1;
	fair = (double)(heads)/(double)(flips);
    }

    public Coin() {
	reset("Heads",0.5);
	    }
    public Coin(String f,Double Fair) {
	reset(f,Fair);
	    }

    public String getFace() {
	return face;
    }
    public int getFlips() {
	return flips;
    }
    public int getHeads() {
	return heads;
    }
    public double getFair() {
	return fair;
    }
}