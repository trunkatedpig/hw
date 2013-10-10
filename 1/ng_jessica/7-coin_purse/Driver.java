import java.io.*; 
import java.util.*; 

public class Driver {
    
    public static void main (String[] args) {
	Coin c1; 
	Coin c2; 
	c1 = new Coin(); 
	c2 = new Coin();
 
	CoinPurse hellokitty;
	hellokitty = new CoinPurse ();
	System.out.println (hellokitty.getAmount()); 
 
	c1.setName ("nickel"); 
	c2.setName ("dime"); 

	hellokitty.addTo (c2); 
	System.out.println (hellokitty.getAmount()); 

	hellokitty.removeFrom (c1); 
	System.out.println (hellokitty.getAmount()); 

    }
}
