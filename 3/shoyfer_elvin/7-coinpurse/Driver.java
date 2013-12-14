import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
		Coin c; 
		c = new Coin();
		System.out.println("\n -- Begin Random Tests -- \n");
		System.out.println("\n -- Prior to Ten Flips -- \n");

		System.out.println(c.getFace());
		System.out.println(c.getFlips());
		System.out.println(c.getHeads());
		System.out.println(c.getTails());
		System.out.println(c.getFairness());


		c.flip();
		c.flip();
		c.flip();
		c.flip();
		c.flip(); 
		c.flip();
		c.flip();
		c.flip();
		c.flip();
		c.flip(); 


		System.out.println("\n -- After Ten Flips -- \n");

		System.out.println(c.getFace());
		System.out.println(c.getFlips());
		System.out.println(c.getHeads());
		System.out.println(c.getTails());
		System.out.println(c.getFairness());

		System.out.println("\n -- End Random Tests -- \n");

		System.out.println("\n -- Begin CoinPurse Tests -- \n");

		CoinPurse cp;

		cp = new CoinPurse(20);
		System.out.println(cp.getAmount() + "-- Initial value of purse: 20; adding 100.");
		c.setValue(100);
		cp.addTo(c);
		System.out.println(cp.getAmount() + "-- should be 100 + 20 = 120");
		c.setValue(30);
		cp.removeFrom(c);
		System.out.println(cp.getAmount() + "-- should be 120 - 30 = 90");

		System.out.println("\n -- End CoinPurse Tests -- \n");



    }
}
