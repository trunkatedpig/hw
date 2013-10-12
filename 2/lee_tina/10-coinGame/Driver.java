import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args){
	CoinGame c = new CoinGame();
	c.turn();
	System.out.println(c.getCurrentBalance1());
	System.out.println(c.getCurrentBalance2());
    }
}
