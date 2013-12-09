import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) { 
	Coin c,c2,c3;
	CoinPurse cp;

	c = new Coin(5);
	System.out.println(c.getName()); //nickel
	System.out.println(c.getFairness()); //0.5
	c.flip(); c.flip(); c.flip(); c.flip();
	c.flip(); c.flip(); c.flip(); c.flip();
	System.out.println(c.getHeads()); //some int x
	System.out.println(c.getTails()); //8-x

	c.resetCount();

	c.changeFairness(1.0);
	System.out.println(c.getFairness()); //1.0
	c.flip(); c.flip(); c.flip(); c.flip();
	c.flip(); c.flip(); c.flip(); c.flip();
	System.out.println(c.getFace()); //Heads
	System.out.println(c.getHeads()); //8
	System.out.println(c.getTails()); //0
	System.out.println(c.getValue()); //5


	cp = new CoinPurse(20);
	c2 = new Coin(19);
	System.out.println(c2.getName()); //butternickel
	cp.addTo(c2);
	System.out.println(cp.getAmount()); //39
	c3 = new Coin(51);
	System.out.println(c3.getName()); //assorted nuts
	cp.removeFrom(c3); //Not enough money.
	cp.addTo(c3);
	System.out.println(cp.getAmount()); //90
    }
}
