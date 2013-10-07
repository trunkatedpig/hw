import java.io.*;
import java.util.*;

public class Driver {

    public static void main (String[] args) {
	Coin c,c1,c2,c3;
	c = new Coin("penny");
	c1 = new Coin ("nickel");
	c2 = new Coin ("dime");
	c3 = new Coin ("quarter");

	System.out.println(c.getValue());
	System.out.println(c1.getValue());
	System.out.println(c2.getValue());	
	System.out.println(c3.getValue());
	System.out.println(c.getName());
	System.out.println(c1.getName());
	System.out.println(c2.getName());	
	System.out.println(c3.getName());

	CoinPurse cp;
	cp = new CoinPurse();
	System.out.println(cp.getAmount());
	cp.addTo(c3);
	cp.addTo(c);
	System.out.println(cp.getAmount());
	System.out.println(cp.getCoins());
	cp.removeFrom(c3);
	System.out.println(cp.getCoins());

    }
}
