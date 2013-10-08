import java.io.*; 
import java.util.*; 

public class Driver {
    
    public static void main (String[] args) {
	Coin c1; 

	c1 = new Coin (); 
	c1.setFairness (50); 
	
	c1.flip(); 
	c1.setValue (0.05); 
	
	String i; 
	i = c1.getFace(); 
	System.out.println (i); 
	System.out.println(c1.getFlips()); 
	System.out.println (c1.getName()); 
	System.out.println (c1.getValue()); 	


	c1.flip();
	c1.setName ("penny"); 
	
	String n; 
	n = c1.getFace(); 
	System.out.println (n); 
	System.out.println(c1.getFlips()); 
	System.out.println (c1.getName()); 
	System.out.println (c1.getValue());
    }
}
