import java.util.*;

public class newcoin {
   
   private String face;
   private int head,tail,tosses;
    private double prob = 0.5;
    public void setup(){
	head = 0;
	tail = 0;
	tosses = 0;
	    }
    public newcoin(){
	setup();
	    }
    public void flip(){
	Random random = new Random();
	double r = random.nextDouble();
        if (r >= prob){
	    head = head + 1;
	    face = "Heads";
	}
	else{
	    tail = tail + 1;
	    face = "Tails";
	}
        tosses = tosses + 1;
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
    public int getTosses() { 
	return tosses;
    }
}
