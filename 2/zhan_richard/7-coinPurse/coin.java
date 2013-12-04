import java.util.*;

public class coin {
   
    private String face,value;
    private int head,tail,tosses,cents;
    private double prob = 0.5;
    public void setup(){
	head = 0;
	tail = 0;
	tosses = 0;
	    }
    public coin(){
	setup();
	    }
    public coin(String v){
	setup();
	if (v == "Penny")
	    cents = 1;
	else if (v == "Nickel")
	    cents = 5;
	else if (v == "Dime")
	    cents = 10;
	else if (v == "Quarter")
	    cents = 25;
	else if (v == "Half dollar")
	    cents = 50;
	else
	    cents = 0;


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
    public boolean isSame(coin c){
	return face == c.face;
    }
    public int getCents(){
	return cents;
    }
}
