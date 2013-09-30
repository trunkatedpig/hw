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
	System.out.println(coin.getFlips());
	System.out.println(coin.flip());
    }
}
