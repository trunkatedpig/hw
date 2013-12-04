<<<<<<< HEAD
public class Driver {

    public static void main(String[] args) {
	Coin coin = new Coin();
	coin.setCount(5);
	System.out.println(coin.count);
	coin.resetCount();
	System.out.println(coin.count);
	
	
=======
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
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
    }

}
