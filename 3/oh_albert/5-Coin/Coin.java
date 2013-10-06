import java.io.*;
import java.util.*;

public class Coin {
    
    private String faceValue;
    private int heads, tails, flips;
    private double probHead = 0.5;
    private int coinValue;
    private String coinName;

    public void resetValues(String f, Double p) {
	heads = 0;
	tails = 0;
	flips = 0;
	faceValue = f;
	probHead = p;
	coinValue = 0;
    }

    public Coin() {
	resetValues("Heads",0.5);
    }

    public Coin(String f) {
	resetValues(f,0.5);
    }
    
    public String getFace() {
	return faceValue;
    }

    public Coin (String coinname, int coinval) {
	coinName = coinname;
	coinValue = coinval;
    }

    public int money () {
	return coinValue;
    }

}
