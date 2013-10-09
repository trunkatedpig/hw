import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) { 
	Coin c,c2;
	
	c = new Coin();
	c.flips = 87;
	System.out.println("Coin 1 flipped " + c.flips + " times.");
	c.resetCount();
	System.out.println("Coin 1 flips reset; now at " + c.flips + " flips.");
	c.face = "tails";
	System.out.println("Coin 1's orientation is " + c.face + " facing up.");

	c2 = new Coin();
	c2.face = "heads";
	System.out.println("Coin 2's orientation is " + c2.face + " facing up.");
    }
}
