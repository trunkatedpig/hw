import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	Coin c = new Coin();
	c.setCoin();
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
	System.out.println(c.getHeads());
	System.out.println(c.getTails());
	
    }
}
