import java.io.*;
import java.util.*;
//worked with Venessa
public class Driver{
    public static void main(String[] args){
	Coin c,c1;
	c = new Coin();
	c1 = new Coin();
	c.setCoin();
	c.coinFlip();
	System.out.println(c.getFace());
	c.coinFlip();
	System.out.println(c.getFace());
	c.coinFlip();
	System.out.println(c.getFace());
	c.coinFlip();
	System.out.println(c.getFace());
	c.coinFlip();
	System.out.println(c.getFace());
	c.coinFlip();
	System.out.println(c.getFace());
	c.coinFlip();
	System.out.println(c.getFace());
	c.coinFlip();
	System.out.println(c.getFace());
	c.coinFlip();
	System.out.println(c.getFace());
	c.coinFlip();
	System.out.println(c.getFace());
	c.coinFlip();
	System.out.println(c.getFace());
	c.coinFlip();
	System.out.println(c.getFace());
	c.coinFlip();
	System.out.println(c.getFace());
	c.coinFlip();
	System.out.println(c.getFace());
	c.coinFlip();
	System.out.println(c.getFace());
	c.coinFlip();
	System.out.println(c.getFace());
	c.coinFlip();
	System.out.println(c.getFace());
	c.coinFlip();
	System.out.println(c.getFace());
	c.coinFlip();
	System.out.println(c.getFace());
	c.coinFlip();
	System.out.println(c.getFace());
	c.coinFlip();
	System.out.println(c.getFace());
	c.coinFlip();
	System.out.println(c.getFace());
	c.coinFlip();
	System.out.println(c.getFace());
	c.coinFlip();
	System.out.println(c.getFace());
	System.out.print("Heads: ");
	System.out.println(c.getHeads());
	System.out.print("Tails: ");
	System.out.println(c.getTails());
	System.out.print("Fairness: ");
	System.out.println(c.getFairness());

	Coinpurse p = new Coinpurse();
	p.addTo(c);
	System.out.println(p.getAmount());
	p.addTo(c);
	System.out.println(p.getAmount());
	p.removeFrom(c);
	System.out.println(p.getAmount());
	
    }
}
