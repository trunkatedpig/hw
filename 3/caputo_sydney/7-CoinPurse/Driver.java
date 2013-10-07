import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String args[]) {


	Coin c = new Coin("quarter");
	Coin c2 = new Coin("dime");
	CoinPurse purse = new CoinPurse();
	System.out.println(c.getInfo());
	purse.addCoins(c);
	System.out.println(purse.getAmt());
	System.out.println(c2.getInfo());
	purse.removeCoins(c2);
	System.out.println(purse.getAmt());
    }
}
