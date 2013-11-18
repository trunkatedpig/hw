import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {

	Coin coin = new Coin();
	System.out.println("The side is" + " " + coin.getSide());

	coin.heads = 1;
	System.out.println("The head count is" + " " + coin.heads);
	coin.reset();
	System.out.println("The head count is" + " " + coin.heads);

    coin.flip();
    System.out.println(coin.getSide());

    coin = new Coin(1);
    System.out.println (coin.getName());

    CoinPurse purse = new CoinPurse(50);
    purse.addTo(coin);
    System.out.println ("================");
    System.out.println (purse.getAmount());
    purse.removeFrom(coin);
    System.out.println ("================");
    System.out.println (purse.getAmount());
    }
}
