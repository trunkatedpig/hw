
import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
	private double pot;

	r = math.random()*1000;
	q = math.random()*1000;

        Coin c, c2;
        c = new Coin();
	c2 = new Coin();

	c.flip();
	c2.flip();
	
	bankAccount ba1, ba2;
	ba1 = new bankAccount();
	ba2 = new bankAccount();
	ba1.deposit(10000);
	ba2.deposit(10000);

	pot = r + q;
	ba1.withdraw(r);
	ba2.withdraw(q);



	if (c.getFace() == "heads") 
	    {
		System.out.println("Coin 1: Heads");
	    }
	
	else
	    {
		System.out.println("Coin 1: Tails");
	    }

	if (c2.getFace() == "heads") 
	    {
		System.out.println("Coin 2: Heads");
	    }
	
	else
	    {
		System.out.println("Coin 2: Tails");
	    }
	
	System.out.print("Coin values the same? ")
	    System.out.println((c.getFace().equals(c2.getFace())));
	
	System.out.println("This round's winner:");
	if (
	    (c.getFace().equals("heads") 
	     &&
	     c2.getFace().equals"heads"))
	    {
		System.out.print("Player 1");
		ba1 = ba1.deposit(pot);
		pot = 0; 
	    }
	else if (
		 (c.getFace().equals("tails") 
		  &&
		  c2.getFace().equals"tails"))
	    {
		System.out.print("Player 2");
		ba2 = ba2.deposit(pot);
		pot = 0; 
	    }
	else {
	    System.out.println("No winner!");
	}	    
    }
}
