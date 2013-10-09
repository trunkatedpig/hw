import java.io.*;
import java.util.*;

public class Driver {
	
	public static void main(String[] args) {
		Coin c;
		c = new Coin();
		CoinPurse p;
		p = new CoinPurse();
		/*System.out.println(c.getFace());
		System.out.println(c.getHead());
		System.out.println(c.getTail());
		c.flip();
		System.out.println(c.getFace());
		System.out.println(c.getHead());
		System.out.println(c.getTail());*/
		System.out.println(p.getMoney());
		System.out.println(p.getCoin());
		p.addTo(c);
		System.out.println(p.getMoney());
		System.out.println(p.getCoin());
	}

}