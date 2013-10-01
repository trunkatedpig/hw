import java.io.*;
import java.util.*;

public class Coin{
    //VARIABLES
    private String face;
    private int flips;
    private int heads;
    private int tails;
    private double fairness;


    //CONSTRUCTORS
    public Coin(){
	face = "heads";
	flips = 0;
	heads = 0;
	tails = 0;
	fairness = 0.5;
    }

    //METHODS
    public void resetFlips(){
	flips = 0;
    }

    public String getFace(){
	return face;
    }

    public int getFlips(){
	return flips;
    }
 
}
