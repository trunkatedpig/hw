import java.util.*;

public class Coin {
   
    private String face,koin;
    private int head,tail,tosses,value;
    private double prob = 0.5;
    public void setup(){
	head = 0;
	tail = 0;
	tosses = 0;
	    }	
    public Coin(){
	setup();
	    }
    public Coin(String z){
	setup();
	if (z == "quarter"){
	    koin = z;
	    value = 25;
	}
	else if (z == "dime"){
	    koin = z;
	    value = 10;
	}
	else if (z == "nickel"){
	    koin = z;
	    value = 5;
	}
	else if (z == "penny"){
	    koin = z;
	    value = 1;
	}
	else 
	    value = 0;
	
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
    public boolean getSame(){
	Coin c;
	c = new Coin();
	c.flip();
	return c.face == face;
    }
    public int getValue(){
	return value;
    }
 
}
