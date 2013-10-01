mport java.io.*;
import java.util.*;

//Create coin class
public class Coin{
    //create instance variables
    private int flips, heads, tails;
    //double is used for floating point
    private double odds;
    private String face;

    //Methods
    public void reset(){
	odds = 50;
	flips = 0;
	tails = 0;
	heads = 0;

    }

    public String getFace(){
	return face;
    }

}