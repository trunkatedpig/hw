import java.io.*;
import java.util.*;

public class Driver {
	public static void main(String[] args) {
		Coin c, c2, c3;
		c = new Coin();
		c2 = new Coin(0.6);
		c3 = new Coin("nickel");
		System.out.println(c.flipCoin());
		System.out.println(c.flipCoin());
		System.out.println(c.flipCoin());
		System.out.println(c.flipCoin());
		System.out.println(c.flipCoin());
		System.out.println(c2.flipCoin());
		System.out.println(c2.flipCoin());
		System.out.println(c2.flipCoin());
		System.out.println(c2.flipCoin());
		System.out.println(c2.flipCoin());
		System.out.println("------------------");
		CoinPurse p;
		p = new CoinPurse();
		System.out.println(p.getAmount());
		p.addTo(c);
		System.out.println(p.getAmount());
		p.addTo(c3);
		System.out.println(p.getAmount());
		p.removeFrom(c2);
		System.out.println(p.getAmount());
		p.removeFrom(c2);

	}
}
