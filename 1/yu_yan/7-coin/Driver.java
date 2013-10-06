import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	Coin c,c1;
	c = new Coin();
	c1 = new Coin();
	c.setCoin();
	c1.setCoin();
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
	System.out.println(p.getPAmount());
	p.addCoin(c);
	System.out.println(p.getPAmount());
	p.addCoin(c1);
	System.out.println(p.getPAmount());
	p.removeCoin(c);
	System.out.println(p.getPAmount());
	
    }
}
