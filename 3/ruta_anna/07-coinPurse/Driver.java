import java.io.*;
import java.util.*;

public class Driver {
	public static void main(String[] args) {

		System.out.println();
		System.out.println("*-* Testing Part 1: class Coin *-*");
		System.out.println();

		Coin c1;
		c1 = new Coin("halfDollar", 0.5);
		System.out.println("Coin 1: (name set to halfDollar and value set to 0.5)");
		System.out.println("Coin name: " + c1.getCoinName());
		System.out.println("Coin value: " + c1.getCoinValue());
		System.out.println();

		Coin c2;
		c2 = new Coin("quarter");
		System.out.println("Coin 2: (name set to quarter)");
		System.out.println("Coin name: " + c2.getCoinName());
		System.out.println("Coin value: " + c2.getCoinValue());
		System.out.println();

		Coin c3;
		c3 = new Coin(0.1);
		System.out.println("Coin 3: (value set to 0.1)");
		System.out.println("Coin name: " + c3.getCoinName());
		System.out.println("Coin value: " + c3.getCoinValue());
		System.out.println();

		System.out.println();
		System.out.println("*-* Testing Part 2: class CoinPurse *-*");
		System.out.println();

		CoinPurse p1;
		p1 = new CoinPurse();
		System.out.println("Purse 1: (initial amount is 0, add Coin 2 and Coin 3)");
		p1.addTo(c2);
		p1.addTo(c3);
		System.out.println("Coin Purse Amount: " + p1.getPurseAmount());
		System.out.println();

		CoinPurse p2;
		p2 = new CoinPurse(1.5);
		System.out.println("Purse 2: (initial amount is 1.5, remove Coin 2 and Coin 3)");
		p2.removeFrom(c2);
		p2.removeFrom(c3);
		System.out.println("Coin Purse Amount: " + p2.getPurseAmount());
		System.out.println();

		CoinPurse p3;
		p3 = new CoinPurse();
		System.out.println("Purse 3: (initial amount is 0, add Coin 2 and remove Coin 3)");
		p3.addTo(c2);
		p3.removeFrom(c3);
		System.out.println("Coin Purse Amount: " + p3.getPurseAmount());
	}
}

