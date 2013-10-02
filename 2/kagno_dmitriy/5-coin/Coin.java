import java.util.*;

public class Coin {
   
   private String face;
   private int head,tail,tosses;
   private double prob = 0.5;

    public void setup(String f){
	head = 0;
	tail = 0;
	tosses = 0;
	    }

    public void flip(String f){
	face= f;
        tosses = tosses + 1;
	    }
    
    public Coin() {
	flip("Tails");
    }
    public Coin(String h){
	flip(h);
    }

    public String getFace(){
	return face;
    }
 
}
