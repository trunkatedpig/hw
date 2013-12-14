import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {
	Coin c1,c2;
	CoinPurse cp;
	c1 = new Coin("Quarter", .25);
	c2 = new Coin(.10);
	cp = new CoinPurse();

	System.out.println();
	System.out.println("Current Amount in Coin Purse: $" + cp.getAmount());
	System.out.println();
	System.out.println("Adding a " + c1.getName() +", Value = $" + c1.getValue()); 
	cp.addTo(c1);
	System.out.println();
	System.out.println("Current Amount in Coin Purse: $" + cp.getAmount());
	System.out.println();
	System.out.println("Removing a " + c2.getName() +", Value = $" + c2.getValue()); 
	cp.removeFrom(c2);
	System.out.println();
	System.out.println("Current Amount in Coin Purse: $" + cp.getAmount()); 
    }
}	
