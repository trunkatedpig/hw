// worked with Eric Kolbusz

import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) { 
	Coin c,c2;
	
	c = new Coin("Dime", 10);
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

    }
}
