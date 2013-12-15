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

    //METHODS
    //Create basic coin function with which to make other coins
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
    //create basic coin
    public Coin(){
        initCoin("penny","heads", 0.5);
    }
    
    //create coin with only name
    public Coin(String n) {
        initCoin(n,"heads", 0.5);
    }

    //create coin reset values
    public void reset(){
        prob = 0.5;
        face = "heads";
        heads = 0;
	tosses = 0;
        name = "penny";
        value = 1;
    }

    //write return functions
    //make sure to specify if int, String or double
    public String getFace(){
	return face;
    }

    public int getValue(){
	return value;
    }
    
    public double getProb(){
        return prob;
    }

    public int getHeads(){
        return heads;
    }

    public String getName(){
        return name;
    }
    
    public int getTosses(){
        return tosses;
    }
    
    //test case to see if coins are equal in value
    public boolean equals(Coin other) {
        return(face.equals(other.getFace()));
    }
}

