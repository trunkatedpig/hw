import java.io.*;
import java.util.*;

public class Coindriver {
    public static void main (String [] args) {

	Coin c = new Coin();
	for (int i = 0; i < 100; i++) {
	c.setCount();
	}

	System.out.println("Total flips: " + c.getTotalFlips());
	System.out.println("Heads: " + c.getHeads());
	System.out.println("Tails: " + c.getTails());
	System.out.println("Percent: " + (double) c.getHeads()/c.getTotalFlips() * 100);
	
	System.out.println("----------------------------");

	/*	c.resetCount();

	System.out.println(c.getTotalFlips());
	System.out.println(c.getHeads());
	System.out.println(c.getTails());
	System.out.println(c.getHeadPercent()); */
    }
}

	  
