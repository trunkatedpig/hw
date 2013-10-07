import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String[] args){
	Coin c1;

	c1 = new Coin();
        System.out.println(c1.getFace());
	System.out.println(c1.getFlips());
	
	c1.flipCoin();
	c1.flipCoin();
	c1.flipCoin();
	c1.flipCoin();
	System.out.println("Total flips:" + c1.getFlips());
	System.out.println("# of Heads:" + c1.getHeads()); 
	System.out.println("# of Tails:" + c1.getTails());

	c1.resetFlips();
	System.out.println("Total flips:" + c1.getFlips());
	System.out.println("# of Heads:" + c1.getHeads()); 
	System.out.println("# of Tails:" + c1.getTails());
    }
}
