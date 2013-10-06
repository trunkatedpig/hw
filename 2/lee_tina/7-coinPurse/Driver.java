//worked with Anish

import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
	Coin c;
	c = new Coin();
	c.resetCount();
	System.out.println(c.coinsEqual());
	//System.out.println(c.flipCoin());
    }
}
