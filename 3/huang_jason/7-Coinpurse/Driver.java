import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) { 
	
	Coin c = new Coin("Dime", 10);
	System.out.println(c.fairness);
	c.flip(); c.flip(); c.flip(); c.flip();
	c.flip(); c.flip(); c.flip(); c.flip();
	System.out.println(c.heads);
	System.out.println(c.tails);

	c.resetCount();

	c.changeFairness(1.0);
	System.out.println(c.fairness);
	c.flip(); c.flip(); c.flip(); c.flip();
	c.flip(); c.flip(); c.flip(); c.flip();
	System.out.println(c.face);
	System.out.println(c.heads);
	System.out.println(c.tails);

	Coinpurse cp,cp2;
	
	cp = new Coinpurse();
	cp.removeFrom(c);
        System.out.println(cp.getAmount());
	cp.addTo(c);
	System.out.println(cp.getAmount());

	cp2 = new Coinpurse(25);
    	cp2.removeFrom(c);
	System.out.println(cp2.getAmount());
        cp2.addTo(c);
	System.out.println(cp2.getAmount());
    }
}
