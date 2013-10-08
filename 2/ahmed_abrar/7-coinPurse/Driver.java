import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Coin coin;
	coin = new Coin("Quarter");
	//coin.reset();
	coin.flip();
	coin.flip();
	coin.reset();
	System.out.println(coin.flip());
	System.out.println(coin.flip());
	System.out.println(coin.flip());
	System.out.println(coin.flip());
	System.out.println(coin.flip());
	System.out.println(coin.getHeads());
	System.out.println(coin.getTails());
	System.out.println(coin.getFlips());
	//coin.setName("Quarter");
	CoinPurse c = new CoinPurse();
	c.addTo(coin);
	System.out.println(c.getAmount());
	Coin coin2 = new Coin ("Dime");
	c.addTo(coin2);
	System.out.println(c.getAmount());
	c.removeFrom(coin);
	System.out.println(c.getAmount());
    }
}
