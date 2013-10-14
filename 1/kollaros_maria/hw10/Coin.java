import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int tosses;
    private int heads;
    private double prob = 0.5; // another way to initialize
    private int value;

    public void initCoin(String f, Double p) {
	face = f;
	tosses=0;
	heads=0;
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

    public void flip(){
	if (Math.random() > prob){
	    face = "Heads";
            heads = heads + 1;
        }
	else{
	    face = "Tails";
        }
	tosses = tosses + 1;

    
    }

    public void setRandProb(){
	prob = Math.random();
    }

}
