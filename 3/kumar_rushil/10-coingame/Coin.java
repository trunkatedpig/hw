import java.util.*;
import java.io.*;
public class Coin {

    private String face,name;
    private int flips, heads, tails;
    private double percenthead = 0.5;
    private double value;

    Random r = new Random();

    public void setNameValue(double worth){
	value = worth;
	if (value == 0.01)
	    name = "penny";
	if (value == 0.05)
	    name = "nickel";
	if (value == 0.10)
	    name = "dime";
	if (value == 0.25)
	    name = "quarter";
    }
 
    public void Flip(){
	if ((r.nextDouble()) <= percenthead){
	    face = "Heads";
	} else {
	    face = "Tails";
	}
	if (face == "Heads"){
	    heads = heads + 1;
	} else {
	    tails = tails + 1;
	}
	flips = flips + 1;
    }

    public String getFace(){
	return face;
    }

    public int getFlips(){
	return flips;
    }

    public double getValue(){
	return value;
    }

    public String getName(){
	return name;
    }

    public void resetCoin(){
	value = 0;
	face = "null";
	name = "null";
    }


}
