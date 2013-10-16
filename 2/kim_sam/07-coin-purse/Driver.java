import java.io.*;
import java.util.*;

public class Driver {
     public static void main (String[] args) {
	 
	 Coin c1,c2,c3,c4;
	 c1 = new Coin ("quarter", 0.25);
	 c2 = new Coin ("dime", 0.10);
	 c3 = new Coin ("nickel", 0.05);
	 c4 = new Coin ("penny", 0.01);
	
	 CoinPurse p;
	 p = new CoinPurse();

	 p.addTo(c1);
	 System.out.println(p.getTotal());
	 p.removeFrom(c2);
	 System.out.println(p.getTotal());
	 p.addTo(c4);
	 System.out.println(p.getTotal());
	 p.addTo(c4);
	 System.out.println(p.getTotal());

	 //c.setProb(.5);
	 //c.flip();
	 //c.flip();
	 //c.flip();
	 //c.flip();
	 //c.flip();
	 //System.out.println(c.getFlips());
	 //System.out.println(c.getCurrentFace());

     }
}
