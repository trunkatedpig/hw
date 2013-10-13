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
	prob = .5;
    }	

    public void reset() {
	head = 0;
	tail = 0;
    }
	
    public String getFace() {
	return face;
    }
    public String getHead() {
	return "The coin has landed heads up " + head + " times";
    }
    public String getTail() {
	return "The coin has landed tail up " + tail + " times";
    }

    public void flip() {
	if (Math.random() <= prob) {
	    face = "head";
	    head = head + 1;
	}
	else {
	    face = "tail";
	    tail = tail + 1;
	}
    }

}