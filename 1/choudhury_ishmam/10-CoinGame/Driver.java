import java.io.*;
import java.util.*;

public class Driver {
	public static void main (String [] args) {
		CoinGame p = new CoinGame();
		p.turn();
		System.out.println("pot: " + p.getPot ());
		System.out.println(p.getFaces());
		System.out.println(p.getBalances());
	}
}