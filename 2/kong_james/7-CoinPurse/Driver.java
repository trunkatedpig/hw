import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String [] args) {
	Coin c;
        c = new Coin();
	c.flip();
	System.out.println("First flip:" + c.getFace());
	c.flip();
	System.out.println("Second flip:" + c.getFace());
	c.flip();
	System.out.println("Third flip:" + c.getFace());
	System.out.println("Total Amount of Flips" + c.getFlipcount());

	Coin a;
	a = new Coin("Penny");
	System.out.println("Coin Name: " + a.getName());
	System.out.println("Coin Value: " + a.getValue());

	Coin b;
	b = new Coin(.25);
        System.out.println("Coin Name:" + b.getName());
	System.out.println("Coin Value: " + b.getValue());
	
	Coin d;
	d = new Coin ("Dime", .10);
	System.out.println("Coin Name:" + d.getName());
	System.out.println("Coin Value:" + d.getValue());
	
	CoinPurse e;
	e = new CoinPurse();
	e.addTo(b);
	System.out.println ("Amount after adding a Quarter" + e.getAmt());
	e.removeFrom(a);
	System.out.println ("Amount after Removing a Penny" + e.getAmt());
    }
}
