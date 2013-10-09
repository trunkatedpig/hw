import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Coin c1;
	c1 = new Coin();
	System.out.println("Number of Flips: " + c1.getFlips());
	System.out.println("Number of Heads: " + c1.getHeads());
	System.out.println("Number of Tails: " + c1.getTails());
	System.out.println();
	System.out.println("Here's the Flip: " + c1.getFace());
	System.out.println("Here's the Flip: " + c1.getFace());	
	System.out.println("Here's the Flip: " + c1.getFace());
	System.out.println();
	System.out.println("Number of Flips: " + c1.getFlips());
	System.out.println("Number of Heads: " + c1.getHeads());
	System.out.println("Number of Tails: " + c1.getTails());
	System.out.println();
	c1.Reset();
	System.out.println("Reset!");
	System.out.println();
	System.out.println("Number of Flips: " + c1.getFlips());
	System.out.println("Number of Heads: " + c1.getHeads());
	System.out.println("Number of Tails: " + c1.getTails());
    }
}
