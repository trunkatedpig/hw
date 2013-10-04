import java.util.*;

public class Coin {
   
   private String face;
   private int head,tail,tosses;
    private double prob = 0.5;
    public void setup(){
	head = 0;
	tail = 0;
	tosses = 0;
	    }
    public Coin(){
	setup();
	    }
    public void flip(){
	Random r = new Random();
        if (r > prob)
	    head = head + 1;
	else
	    tail = tail + 1;
        tosses = tosses + 1;
	    }
    
    
    public String getHead(){
	return Head;
    }
    public String getTail(){
	return Tail;
    }
    public String getFace(){
	return face;
    }
 
}
