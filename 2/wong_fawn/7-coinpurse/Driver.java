import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String args[]) {
    	Coin c = new Coin("quarter");
	Coin c2 = new Coin("nickel");
    	CoinPurse purse = new CoinPurse();
	System.out.println(c.getInfo());
	purse.addTo(c);
	System.out.println(purse.getAmount());
	System.out.println(c2.getInfo());
	purse.removeFrom(c2);
	System.out.println(purse.getAmount());
    }
}