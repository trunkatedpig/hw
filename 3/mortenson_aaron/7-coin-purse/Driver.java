import java.util.*;
import java.io.*;

public class Driver{

	public static void main (String args[]) {
		Coin c0, c1, c2, c3, c4;
		c0 = new Coin();
		c1 = new Coin(.8);
		System.out.println(c0.getFace());
		System.out.println(c1.getFace());
		System.out.println("----");
		c0.flip();
		c0.flip();
		c0.flip();
		c0.flip();
		c0.flip();
		c0.flip();
		c0.flip();
		c0.flip();
		System.out.println(c0.getHeads());
		System.out.println(c0.getTails());
		System.out.println(c0.getFlips());
		System.out.println(c0.getFace());
		System.out.println("----");
		c1.flip();
		c1.flip();
		c1.flip();
		c1.flip();
		c1.flip();
		c1.flip();
		c1.flip();
		c1.flip();
		System.out.println(c1.getHeads());
		System.out.println(c1.getTails());
		System.out.println(c1.getFlips());
		System.out.println(c1.getFace());
		System.out.println("----");
		c0.resetFlips();
		c1.resetFlips();
		System.out.println(c1.getHeads());
		System.out.println(c1.getTails());
		System.out.println(c1.getFlips());
		System.out.println(c1.getFace());
		System.out.println("----");
		System.out.println(c0.getHeads());
		System.out.println(c0.getTails());
		System.out.println(c0.getFlips());
		System.out.println(c0.getFace());

		CoinPurse cp1;
		cp1 = new CoinPurse(20);
		c1 = new Coin("Penny");
		c2 = new Coin("Nickel");
		c3 = new Coin("Dime");
		c4 = new Coin("Quarter");
		
		System.out.println(cp1.getAmount());
		cp1.addTo(c3);
		System.out.println(cp1.getAmount());
		cp1.removeFrom(c4);
		System.out.println(cp1.getAmount());
		cp1.removeFrom(c4);
		System.out.println(cp1.getAmount());
	}
	
}
