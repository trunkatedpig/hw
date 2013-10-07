import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {

	coinPurse b = new coinPurse();
	Coin c = new Coin(25);
	System.out.println ("Testing addTo");
	b.addTo(c);
        System.out.println ("Amount in purse: " + b.getAmount() + " cents");
	
	System.out.println ("_________________________");
	
	System.out.println ("Testing removeFrom");
	b.removeFrom(c);
	System.out.println ("Amount in purse: " + b.getAmount() + " cents");

	/*	Coin c = new Coin(1);
	c.flip();
	System.out.println ("You flipped a " + c.getName() + " which is worth " + c.getValue() + " cent(s)");
	System.out.println (c.getFace());
	System.out.println ("# OF HEADS:" + " " + c.getHeads());
	System.out.println ("# OF TAILS:" + " " + c.getTails());
	System.out.println ("Ratio of heads to total: " + c.getFairness());  */
    }
}

