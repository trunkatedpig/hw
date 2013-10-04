import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int flips;
    private int heads;
    private int tails;
    private int fair;
    
    public Coin (int flips,int heads,int tails,int fair){
	face = "Heads";
	flips = flips;
	heads = heads;
	tails = tails;
	fair = fair;
    }

    public String getFace (){
	return face;
    }
    public void coinReset(){
	flips = 0;
    }
    public int getFlips(){
	return flips;
	    }
}