import java.io.*;
import java.util.*;

public class CoinGame {
	double pot;
	BankAccount player1, player2;
	Coin coin1, coin2;

	Random generator = new Random();


	public CoinGame() {
		coin1 = new Coin();
		coin2 = new Coin();
		// Default: 100 funds per player starting value
		player1 = new BankAccount("Player 1", 1, 100);
		player2 = new BankAccount("Player 2", 2, 100);

	}

	public CoinGame(double f) {
		coin1 = new Coin();
		coin2 = new Coin();
		player1 = new BankAccount("Player 1", 1, f);
		player2 = new BankAccount("Player 2", 2, f);

	}

	public void turn() {

		// generating withdrawal amounts

		double withdraw1 = generator.nextDouble() * 100;
		double withdraw2 = generator.nextDouble() * 100;

		// withdrawing from bank accounts

		player1.withdraw(withdraw1);
		player2.withdraw(withdraw2);

		// adding money to the pot

		pot = pot + withdraw1 + withdraw2;

		// two random coin flips

		coin1.flip();
		coin2.flip();

		// results

		String face1 = coin1.getFace();
		String face2 = coin2.getFace();

		if (face1.equals("Heads") && face2.equals("Heads")) {
			player1.deposit(pot);
			System.out.println("Player 1 wins! " + pot + " USD awarded.");
			pot = 0;
		} else if (face1.equals("Tails") && face2.equals("Tails")) {
			player2.deposit(pot);
			System.out.println("Player 2 wins! " + pot + " USD awarded.");
			pot = 0;
		} else {
			System.out.println("Tie! The money stays in the pot.");
		}

	}

	public void play(int n) {
		int count = 0;
		while (count < n) {
			turn();
			count = count + 1;
		}

		System.out.println("Game over.");
		System.out.println("Player 1: " + player1.getBalance() + " USD");
		System.out.println("Player 2: " + player2.getBalance() + " USD");

	}

}