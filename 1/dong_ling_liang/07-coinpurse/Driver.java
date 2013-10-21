import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args) {
	Coin c;
	c = new Coin();
	
	System.out.println(c.currentFace());
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
	
	System.out.println(c.currentFace());
	System.out.println(c.getTails());
	System.out.println(c.getHeads());
	c.reset();
	c.setFairness(0.1);
	c.setAmount(0.02);
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
	System.out.println(c.getTails());
	System.out.println(c.getHeads());
	System.out.println(c.getAmount());
	
	System.out.println("New Testsssssssssssssss");
	Coinpurse cp= new Coinpurse();
	c.reset();
	cp.addTo(c);
	System.out.println(cp.purseValue());
	c.flip();
	c.flip();
	cp.addTo(c);
	System.out.println(cp.purseValue());
	
    }
}
