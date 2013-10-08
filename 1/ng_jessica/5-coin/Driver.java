import java.io.*; 
import java.util.*; 

public class Driver {
    
    public static void main (String[] args) {
	Coin c1; 

	c1 = new reset (); 
	c1.setFairness (50); 
	c1.flip(); 
	
	String i; 
	i = c1.getFace(); 
	System.out.println (i); 

	c1.reset (); 

	c1.setFairness (50); 
	c1.flip(); 
	
	String n; 
	n = c1.getFace(); 
	System.out.println (i); 
    }
}
