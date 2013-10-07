import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String args[]){

	Coin c1, c2;
	c1 = new Coin("penny");
	c2 = new Coin ("quarter");

	CoinPurse cp;
	cp = new CoinPurse();

	System.out.println ("In the Purse: " + cp.getAmount());
	cp.addTo(c2);
	cp.removeFrom(c1);
	System.out.println("Now there is " + cp.getAmount());

    }
}
// I am not exactly sure what we did in class on Thursday b/c I was absent
