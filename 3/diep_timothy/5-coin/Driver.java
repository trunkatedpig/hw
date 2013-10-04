import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {
	Coin c1,c2;
	CoinPurse cp;
	c1 = new Coin("Quarter", 25);
	c2 = new Coin(10);
	cp = new CoinPurse();
	cp.addTo(c1);
	cp.removeFrom(c2);
	System.out.println(c1.getValue());
	System.out.println(c1.getName());
	System.out.println(cp.getAmount());
    }
}	
