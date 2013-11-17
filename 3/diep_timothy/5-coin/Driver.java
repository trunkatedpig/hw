import java.io.*;
import java.util.*;

public class Driver {
<<<<<<< HEAD

    public static void main(String[] args) {
	Coin coin;
	coin = new Coin();
	coin.Reset();
	System.out.println("Number of Flips:" + coin.getFlips());
	System.out.println("Number of Heads:" + coin.getHeads());
	System.out.println("Number of Tails:" + coin.getTails());
    }
}	
=======
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
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
