import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Coin c;
	CoinPurse p;
	
        c = new Coin("quarter");
	System.out.println("This coin is a " + c.getName());
	System.out.println("and its value is " + c.getValue());
	System.out.println();
	
        c.flip();
	System.out.println("This coin's fairness is " + c.getFairness());
        System.out.println("Flip 1: " + c.getFace());
        c.flip();
        System.out.println("Flip 2: " + c.getFace());
        c.flip();
        System.out.println("Flip 3: " + c.getFace());
	System.out.println();

        c.setFairness(50);
        System.out.println("This coin's fairness is " + c.getFairness());
        c.flip();
        System.out.println("Flip 1: " + c.getFace());
        c.flip();
        System.out.println("Flip 2: " + c.getFace());  
        System.out.println();
	
	p = new CoinPurse();
        System.out.println("The amount of money in this coin purse is " + p.getAmount());
	p.addTo(c);
	System.out.println("The amount of money in this coin purse is " + p.getAmount());
	p.removeFrom(c);
	System.out.println("The amount of money in this coin purse is " + p.getAmount());
   }
}
