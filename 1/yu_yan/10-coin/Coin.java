import java.io.*;
import java.util.*;

public class Coin{
    private int heads,percent; //percent = probability of heads
    private Random r = new Random();
    
    public void setCoin(){
	heads = 0;
	percent = 50;
	    }
   
    public void coinFlip(){
	if (r.nextInt(100) < percent)
	    heads = heads + 1;
	else
	    {}
    }
    
    public int getHeads(){
	return heads;
    }
    
}
