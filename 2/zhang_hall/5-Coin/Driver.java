import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args){
	Coin c1,c2;
	
	c1 = new Coin();
	System.out.println(c1.getFace());
	System.out.println(c1.getFlips());
	c1.FlipCoin();
	System.out.println(c1.getFlips());
	System.out.println(c1.getFace());
	/*For testing purposes, I used .1 as the new
	  "probability". The output for this rigged coin should
	  almost always be heads.*/
	c2 = new Coin();
        c2.RiggCoin(.1);
	System.out.println(c2.getFlips());
	System.out.println(c2.getFace());
    }
}
