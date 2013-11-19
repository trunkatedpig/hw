import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Coin c1, c2;
	CoinPurse cp1;
	c1 = new Coin();
	c2 = new Coin(25, "quarter");
	cp1= new CoinPurse();
	System.out.println(c1.getFlips());
	c1.setCount();
	System.out.println(c1.getFlips());
	System.out.println(c1.getFace());
	System.out.println(c1.flipCoin());
	cp1.addTo(c2);
	System.out.println(cp1.getAmount());
	cp1.removeFrom(c2);
	System.out.println(cp1.getAmount());

	

    }
}