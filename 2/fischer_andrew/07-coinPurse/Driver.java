//Andrew Fischer & John Safy

import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {

        Coin c, c2;
        c = new Coin();
	c2 = new Coin();

	c.flip();
	c2.flip();
	
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

	System.out.println((c.getFace().equals(c2.getFace())));
       	
	    
    }
}
