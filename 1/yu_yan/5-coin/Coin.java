import java.io.*;
import java.util.*;

public class Coin{
    private String face;
    private int heads,tails,flips,percent; //percent = probability of heads
    private Random r = new Random();
    
    public void setCoin(){
	face = "Heads";
	resetCount();
	percent = 50;
	    }
    public void setCoin(String face,int percent){
	face = face;
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
    public int getHeads(){
	return heads;
    }
    public int getTails(){
	return tails;
    }
}
