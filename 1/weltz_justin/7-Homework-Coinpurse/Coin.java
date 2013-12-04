import java.io.*;
import java.util.*;
//worked with Venessa
public class Coin{
    private String face,name;
    private int percent; //percent = probability of heads
    private double amount,heads,tails,flips;
    private Random r = new Random();
    
    public void setCoin(){
	face = "Heads";
	name = "Quarter";
	amount = 0.25;
	resetCount();
	percent = 50;
	    }
    public void setCoin(String face,int percent,String name,double amount){
	face = face;
	name = name;
	amount = amount;
	percent = percent;
	resetCount();
    }
    
    public void coinFlip(){
	flips = flips + 1;
	if (r.nextInt(100) < percent)
	    {heads = heads + 1;
		face = "Heads";
		    }
	else {tails = tails + 1;
	    face = "Tails";
		}
    }
    
    public void resetCount(){
	heads = 0;
	tails = 0;
	flips = 0;
    }
    
    ////////////

    public String getFace(){
	return face;
    }
    public double getHeads(){
	return heads;
    }
    public double getTails(){
	return tails;
    }
    public double getFairness(){
	return heads/flips;
    }
    public double getAmount(){
	return amount;
    }
    
}
