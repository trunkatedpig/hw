import java.io.*;
import java.util.*;

public class Coin2 {
    private String face, name;
    private int flips, heads, tails, fairness;
    private double value;

    public Coin2() {
	name = "quarter";
	value = 0.25;
    }

    public String getName() {
	return name;
    }

    public double getValue() {
	return value;
    }
	
    /*
    public String setFace(String facevalue) {
	face = facevalue;
	return face;
    }

    public int Reset() {
	heads = 0;
	tails = 0;
	return heads;
    }
    
    public String getFace() {
	return face;
    }
    */
}
