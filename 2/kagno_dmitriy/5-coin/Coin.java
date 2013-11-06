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
	double r2 = r.nextDouble();
        if (r2 > prob){
	    head = head + 1;
	    face = "heads";
       	}
        else{
	    tail = tail + 1;
	    face = "tails";
        tosses = tosses + 1;
        }
     }
    
    
    public int getHead(){
	return head;
    }
    public int getTail(){
	return tail;
    }
    public String getFace(){
	return face;
    }
    public boolean getSame(){
	Coin c;
	c = new Coin();
	c.flip();
	return c.face == face;
 }
 
}
