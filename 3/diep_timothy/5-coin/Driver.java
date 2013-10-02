import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {
	Coin coin;
	coin = new Coin();
	coin.Reset();
	System.out.println("Number of Flips:" + coin.getFlips());
	System.out.println("Number of Heads:" + coin.getHeads());
	System.out.println("Number of Tails:" + coin.getTails());
    }
}	
