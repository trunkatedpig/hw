import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Coin coin;
	coin = new Coin();
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
    }
}
