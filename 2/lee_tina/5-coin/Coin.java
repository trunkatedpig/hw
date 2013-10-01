import java.io.*;
import java.util.*;

public class Coin { 
    private String face;
    private int flips;
    private int heads;
    private int tails;
    private int fairness;

    public Coin(){
	face = "tails";
    }
    
    public void resetCount(){
	flips = 0;
	heads = 0;
	tails = 0;
    }

    public String getFace(){
	return face;
    }
}
    
