import java.io.*;
import java.util.*;

public class Coin {

    private String face;
    private int head, tail;
    private double prob;

    public Coin() {
	face = "head";
	head = 0;
	tail = 0;
	prob = 50.0;
    }	

    public void reset() {
	head = 0;
	tail = 0;
    }
	
    public String getFace() {
	return "The coin is " + face + " up";
    }
    public String getHead() {
	return "The coin has landed head up " + head + " times";
    }
    public String getTail() {
	return "The coin has landed tail up " + tail + " times";
    }

    public void flip() {
	Random r = new Random();
	if (r.nextDouble() <= prob) {
	    face = "head";
	    head = head + 1;
	}
	else {
	    face = "tail";
	    tail = tail + 1;
	}
    }

}