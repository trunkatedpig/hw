import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int flips;
    private int fairness;

    public Coin(){
	face = "Heads";
	flips = 1;
	fairness = 50;
    }

    public void resetCount(){
	flips = 0;
    }
    
    public int getFlips(){
	return flips;
    }
    public String getFace(){
    return face;
    }

}
