import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Coin c;
	c = new Coin();

	System.out.println("Name of coin: " + c.getName());
	System.out.println("Value of coin: $" + c.getValue());

	System.out.println();

	System.out.println("Face: " + c.getFace());
	System.out.println("Number of flips: " + c.getFlips());
	System.out.println("Number of heads: " + c.getHeads());
	System.out.println("Number of tails: " + c.getTails());

	c.flip();
	System.out.println();

	System.out.println("Face: " + c.getFace());
	System.out.println("Number of flips: " + c.getFlips());
	System.out.println("Number of heads: " + c.getHeads());
	System.out.println("Number of tails: " + c.getTails());

	c.flip();
	System.out.println();

 	System.out.println("Face: " + c.getFace());
	System.out.println("Number of flips: " + c.getFlips());
	System.out.println("Number of heads: " + c.getHeads());
	System.out.println("Number of tails: " + c.getTails());

	c.flip();
	System.out.println();

 	System.out.println("Face: " + c.getFace());
	System.out.println("Number of flips: " + c.getFlips());
	System.out.println("Number of heads: " + c.getHeads());
	System.out.println("Number of tails: " + c.getTails());

	c.flip();
	System.out.println();

 	System.out.println("Face: " + c.getFace());
	System.out.println("Number of flips: " + c.getFlips());
	System.out.println("Number of heads: " + c.getHeads());
	System.out.println("Number of tails: " + c.getTails());

	c.flip();
	System.out.println();

	c.resetCount();

	System.out.println("Flip count reset.");
	System.out.println();

 	System.out.println("Face: " + c.getFace());
	System.out.println("Number of flips: " + c.getFlips());
	System.out.println("Number of heads: " + c.getHeads());
	System.out.println("Number of tails: " + c.getTails());

	System.out.println();

	CoinPurse p;
	p = new CoinPurse();
	Coin d, n;
	d = new Coin(0.10);
	n = new Coin("Nickel");

	System.out.println("Amount in purse: " + p.getAmount());

	System.out.println();
	p.addTo(d);

	System.out.println("Added 10 cents.");
	System.out.println("Amount in purse: " + p.getAmount());

	System.out.println();
	p.removeFrom(n);

	System.out.println("Removed 5 cents.");
	System.out.println("Amoung in purse: " + p.getAmount());
     }
}
