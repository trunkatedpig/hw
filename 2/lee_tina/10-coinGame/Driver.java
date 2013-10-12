import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args){
	CoinGame c1 = new CoinGame();
	c1.turn();
	System.out.println(c1.getCurrentBalance1());
	System.out.println(c1.getCurrentBalance2());
       	CoinGame c2 = new CoinGame();
	c2.play(10);
	System.out.println(c2.getCurrentBalance1());
        System.out.println(c2.getCurrentBalance2());
	}
}
