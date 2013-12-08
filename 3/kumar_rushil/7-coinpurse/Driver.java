import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args){
	Coin quarter, nickel, penny, dime;
	CoinPurse cp;
	quarter = new Coin (.25 , "Quarter");
	nickel = new Coin (.5, "Nickel");
	penny = new Coin (.1, "Penny");
	dime = new Coin (.10, "Dime");
	cp = new CoinPurse();
	cp.addTo(quarter);
	cp.addTo(dime);
	cp.addTo(penny);
	cp.addTo(nickel);
	System.out.println ("$" + cp.getAmount());
	cp.removeFrom(quarter);
	System.out.println ("$" + cp.getAmount());
   }
}
