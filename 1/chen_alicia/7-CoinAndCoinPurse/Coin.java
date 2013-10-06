import java.io.*;
import java.util.*;

public class Coin {
    private String face; //"heads" or "tails"
    private int tosses, heads;
    private double prob = 0.5; //percent of heads

    public void initcoin (String f, double p){
	face = f;
	tosses = 0;
	heads = 0;
	prob = p;
    }

    public Coin(){
	initcoin("Heads",0.5);
    }


    public Coin(String f) {
	initcoin(f,0.5);
    }

    public void resetCounts(){
	tosses = 0;
	heads = 0;
    }

    public String getFace() {
	return face;
    }

    public boolean equals(Coin other) {
	return face.equals(other.getFace());
    }

    public String flip(Coin c) {
	return " ";
}
}
