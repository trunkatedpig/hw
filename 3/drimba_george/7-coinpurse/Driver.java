import java.util.*;
import java.io.*;

public class Driver{

	public static void main (String args[ ]) {
	    Coin c0, c1, c2, c3, c4;// no reason that it would not work on the larger coins
	        
		Purse cp;
		cp = new CoinPurse(100);
		c1 = new Coin("Penny");
		c2 = new Coin("Nickel");
		c3 = new Coin("Dime");
		c4 = new Coin("Quarter");

		System.out.println(cp.getAmount());
		cp1.addTo(c3);
		System.out.println(cp.getAmount());
		cp1.removeFrom(c4);
		System.out.println(cp.getAmount());
		cp1.removeFrom(c4);
		System.out.println(cp.getAmount());
	}

}
