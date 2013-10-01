import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int flips;
    private int tails;
    private int heads;
    private double chance;
    public Coin() {
	flips=12;
	face="heads";
	tails=0;
	heads=0;
	chance= .5;
    }
    public void setCount() {
	flips=0;
	tails=0;
	heads=0;
    }
    public String getFace() {
	return face;
	    }
    public int getFlips() {
	return flips;
    }
}
