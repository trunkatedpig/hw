import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	/*test for flip randomness
	Coin c1 = new Coin();
	c1.flip();
	System.out.println(c1.getFace());
	
	Coin c2 = new Coin();
	c2.setFairness(1);
	c2.flip();
	System.out.println(c2.getFace());

	Coin c3 = new Coin();
	c3.setFairness(0);
	c3.flip();
	System.out.println(c3.getFace());
	*/

	/*test for names and values
	Coin c4 = new Coin();
	System.out.println(c4.getName());
	System.out.println(c4.getValue());
	
	Coin c5 = new Coin("dime");
	System.out.println(c5.getName());
	System.out.println(c5.getValue());
	
	Coin c6 = new Coin(.05);
	System.out.println(c6.getName());
	System.out.println(c6.getValue());
	
	Coin c7 = new Coin("foo", .07);
	System.out.println(c7.getName());
	System.out.println(c7.getValue());
	*/

	Coin c8 = new Coin("quarter");
	Coin c9 = new Coin("dime");
	CoinPurse p1 = new CoinPurse();
	System.out.println(p1.getAmount());

	CoinPurse p2 = new CoinPurse(c8);
	System.out.println(p2.getAmount());
	p2.addTo(c9);
	System.out.println(p2.getAmount());

	System.out.println(c8.getValue());
	//	System.out.println(.35-.25);
	p2.removeFrom(c8);
	System.out.println(p2.getAmount());

    }
}
