import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {
       	Coin c, c1, c2, c3, c4;
	CoinPurse p;
	c = new Coin();
	c1 = new Coin ("Dime", 0.8);
	c2 = new Coin ("Quarter", 0.6);
	c3 = new Coin ("Nickel", 0.35);
	c4 = new Coin ("Penny", 0.01);
	c.flip();
	c1.flip();
	c2.flip();
	c3.flip();
	c4.flip();
	System.out.println("c: Face, Name, and Value");
	System.out.println(c.getFace());
	System.out.println(c.getName());
	System.out.println(c.getValue());
	System.out.println("c1: Face, Name, and Value");
	System.out.println(c1.getFace());
	System.out.println(c1.getName());
	System.out.println(c1.getValue());
	System.out.println("c2: Face, Name, and Value");
	System.out.println(c2.getFace());
	System.out.println(c2.getName());
	System.out.println(c2.getValue());
	System.out.println("c3: Face, Name, and Value");
	System.out.println(c3.getFace());
	System.out.println(c3.getName());
	System.out.println(c3.getValue());
	System.out.println("c4: Face, Name, and Value");
	System.out.println(c4.getFace());
	System.out.println(c4.getName());
	System.out.println(c4.getValue());

	System.out.println("..................................");

	System.out.println("Purse:");
	p = new CoinPurse();
	p.addTo(c);
	System.out.println("Added c:");
	System.out.println(Double.toString(p.totalPurse()));
	p.addTo(c1);
	System.out.println("Added c1:");
	System.out.println(Double.toString(p.totalPurse()));
	p.addTo(c2);
	System.out.println("Added c2:");
	System.out.println(Double.toString(p.totalPurse()));
	p.addTo(c3);
	System.out.println("Added c3:");
	System.out.println(Double.toString(p.totalPurse()));
	p.addTo(c4);
	System.out.println("Added c4:");
	System.out.println(Double.toString(p.totalPurse()));
    }
}
