import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String args[]) {
	Coin c = new Coin("quarter");
	Coin c2 = new Coin("dime");
	Coin c3 = new Coin("nickel");
	Coin c4 = new Coin("penny");
	System.out.println(c.getAll());
	c.flip();
	c.flip();
	c.flip();
	System.out.println(c.getAll());
	c.resetCount();
	System.out.println(c.getAll());

	CoinPurse x = new CoinPurse();
	System.out.println(x.getInfo());

	x.addCoin(c2);
	x.addCoin(c3);
	System.out.println(x.getInfo());

	x.removeCoin(c4);
	System.out.println(x.getInfo());
    }
}
