import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {	
	Coin t = new Coin();

	// Trials of Flips
	t.flip();
	System.out.println(t.getFace());
	t.flip();
	System.out.println(t.getFace());
	t.flip();
	System.out.println(t.getFace());
	t.flip();
	System.out.println(t.getFace());
	t.flip();
	System.out.println(t.getFace());

	// Seperator
	System.out.println();
	System.out.println("-----------");
	System.out.println();

	// Getting Names + Values
	Coin a = new Coin(1);
	System.out.println(a.getName());
	System.out.println(a.getValue());

	Coin b = new Coin(5);
	System.out.println(b.getName());
	System.out.println(b.getValue());

	Coin c = new Coin(10);
	System.out.println(c.getName());
	System.out.println(c.getValue());

	Coin d = new Coin(25);
	System.out.println(d.getName());
	System.out.println(d.getValue());
	
	// Seperator
	System.out.println();
	System.out.println("-----------");
	System.out.println();

	// With the Purse

	CoinPurse cPurse =  new CoinPurse();
	cPurse.addTo(a);
	cPurse.addTo(b);
	cPurse.addTo(b);
	cPurse.addTo(c);
	cPurse.addTo(d);
	System.out.println(cPurse.getAmount());
	
    }
}
