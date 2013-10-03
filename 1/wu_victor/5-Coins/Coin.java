import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int tosses;
    private int heads;
    private double prob = 0.5;
    private double r;

    public void initCoin(String f, Double p) {
	face = f;
	tosses=0;
	heads=0;
	prob=p;
    }

    public Coin() {
	initCoin("Heads",0.5);
    }
    public Coin(String f) {
	initCoin(f,0.5);
    }

    public void flip () {

       	if ( 1 > prob )
	    setFace("Heads");
	else
	    setFace("Tails");

    }

    public void setFace(String f) {
	f = face;
    }
 
    public String getFace() {
	return face;
    }

    public boolean equals(Coin other) {
	return face.equals(other.getFace());
    }
    
}
