import java.util.*;
import java.io.*;

public class CoinGame {
	private BankAccount p1;
	private BankAccount p2;
	private Coin c1;
	private Coin c2;
	private double pot;

//random comment

	public CoinGame(BankAccount b1, BankAccount b2) {
		p1 = b1;
		p2 = b2;
		c1 = new Coin();
		c2 = new Coin();
		pot = 0;
	}

	public void turn() {
		Random rand = new Random();
		double amount1, amount2;
		amount1 = rand.nextInt(1000) * 0.01;
		amount2 = rand.nextInt(1000) * 0.01;
		if (p1.getBalance() > amount1) {
			pot = pot + amount1;
			p1.withdraw(amount1);}
		if (p2.getBalance() > amount2) {
			pot = pot + amount2;
			p2.withdraw(amount2);}
		if (c1.flip().equals("heads") && c2.flip().equals("heads")) {
			p1.deposit(pot);
			pot = 0;}
		else if (c1.flip().equals("tails") && c2.flip().equals("tails")) {
			p2.deposit(pot);
			pot = 0;}
	}

	public void play(int n) {
		while (n > 0) {
			turn();
			n = n - 1;}
	}

	public String values() {
		return "Player 1 has " + p1.getBalance() + " and Player 2 has " + p2.getBalance() + ".";
	}

}
