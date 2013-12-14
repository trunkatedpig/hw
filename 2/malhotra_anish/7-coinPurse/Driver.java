//Anish Malhotra and Tina Lee

import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
        Coin c;
	c = new Coin("dime");
	//c.resetCount();
	//System.out.println(c.coinsEqual());
	//System.out.println(c.flipCoin());
	//System.out.println(c.val());
	
	CoinPurse p = new CoinPurse(0.50);
	System.out.println(p.getAmount());
    }
}
