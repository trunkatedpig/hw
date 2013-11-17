import java.io.*;
import java.util.*;

public class Coindriver {
    public static void main (String [] args) {

<<<<<<< HEAD
	Coin c;

	c = new Coin ();
	c.setCount();

	System.out.println(c.getTotalFlips());
	System.out.println(c.getHeads());
	System.out.println(c.getTails());
	System.out.println(c.getHeadPercent());
	
	System.out.println("----------------------------");

	c.resetCount();
=======
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
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3

	System.out.println(c.getTotalFlips());
	System.out.println(c.getHeads());
	System.out.println(c.getTails());
<<<<<<< HEAD
	System.out.println(c.getHeadPercent());
=======
	System.out.println(c.getHeadPercent()); */
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
    }
}

	  
