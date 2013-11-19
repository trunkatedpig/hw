import java.io.*;
import java.util.*;

//Create coin class
public class Coin{
    //create instance variables
    private int tosses, heads, value;
    //double is used for floating point, 
    //saying = is another way to initialize.
    private double prob = 0.5;
    private String face, name;

    //Methods
    public void initCoin(String n, String f, Double p) {
	face = f;
	tosses = 0;
	heads = 0;
	prob = p;
	name = n;
	if (name == "penny") {
	    value = 1;
	} else if (name == "nickel") {
	    value = 5;
	} else if (name == "dime") {
	    value = 10;
	} else if (name == "quarter") {
	    value = 25;
	} else {
	    value = 0;
	}
    }

    public Coin(){
	initCoin("penny","Heads", 0.5);
    }

    public Coin(String n) {
	initCoin(n,"Heads", 0.5);
    }


    public void reset(){
	prob = 0.5;
	flips = 0;
	heads = 0;
	name = "penny";
	value = 1;
    }

    public String getFace(){
	return face;
    }

    public String getValue(){
	return value;
    }
    
    public String getProb(){
	return prob;
    }
    
    public String getHeads(){
	return heads;
    }

    public String getName(){
	return name;
    }
    
    public boolean equals(coin other) {
	return(face.equals(other.getFace()))
    }
}