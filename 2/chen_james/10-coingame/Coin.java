import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int tosses;
    private int heads;
	private int tails;
    private double prob = 0.5; // another way to initialize
    private int value;

    public void initCoin(String f, Double p) {
	face = f;
	tosses=0;
	heads=0;
	tails = 0;
	prob=p;
    }

    public Coin(int v) {
	value = v;
	initCoin("Heads",0.5);
    }

    public Coin() {
	initCoin("Heads",0.5);
    }


    public Coin(String f) {
	initCoin(f,0.5);
    }

    public String getFace() {
	return face;
    }

    public boolean equals(Coin other) {
	return face.equals(other.getFace());
    }

    public int getValue() {
	return value;
    }

    public String toString() {
	return ""+value+" cents";
    }

    public void flip() {
		tosses += 1;
		Random r = new Random();
		if (r.nextDouble() >= prob) {
			heads += 1;
			face = "Heads";
		}
		else { 
			tails += 1;
			face = "Tails";
		}	
	} 
    }


