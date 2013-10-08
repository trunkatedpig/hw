import java.util.*;
import java.io.*;

public class Driver {

    public static void main(String[] args) {
	Coin coin = new Coin("Quarter", .25);
	Coin coin2 = new Coin("Dime", .10);
	Coin coin3 = new Coin("Nickel", .05);
	Coin coin4 = new Coin("Penny", .01);
	Coin coin5 = new Coin("test", .50);

	CoinPurse purse = new CoinPurse();
	purse.addTo(coin);
	System.out.println(purse.getAmount());

	purse.addTo(coin2);
	System.out.println(purse.getAmount());

	purse.removeFrom(coin5);
	System.out.println(purse.getAmount());

	purse.removeFrom(coin4);
	System.out.println(purse.getAmount());
    }

}
