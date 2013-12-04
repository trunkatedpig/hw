import java.io.*;
import java.util.*;

public class Coin{
    private String face;
    private int head,tail;
    private double fairness;

    public Coin(){
	face = "heads";
	head = 0;
	fairness = 0.5;
    }
    public void reset(){
	head = 0;
    }

    public String getFace(){
	return face;
    }

    public String getHead(){
	return "Landed heads" + head + "times";
    }

    public String getTail(){
	return "Landed tails" + tail + "times";
    }

    public void flip(){
	if (Math.random() <= fairness){
	    face = "head";
	    head = head + 1;
	}
	else {
	    face = "tail";
	    tail = tail + 1;
	}
    }
}


