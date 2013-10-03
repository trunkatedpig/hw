import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Coin c;
	c = new Coin();
	c.reset("Heads",0.5);
	while (c.getFlips() < 10) {
	    c.flip();
	    System.out.println("Flipped: " + c.getFace());
	    System.out.println("Heads: " + Integer.toString(c.getHeads()));
	    System.out.println("Flips: " + Integer.toString(c.getFlips()));
	    System.out.println("Fairness: " + Double.toString(c.getFair()));
	    System.out.println("\n");
	}
    }
}