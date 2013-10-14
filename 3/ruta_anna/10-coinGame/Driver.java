import java.io.*;
import java.util.*;

public class Driver {
	public static void main(String[] args) {

		System.out.println();
		System.out.println("*-* Playing Coin Game *-*");
		System.out.println();

		String player1 = "Anna";
		String player2 = "Paulina";
		double initAmount = 100.0;

		CoinGame g1;
		g1 = new CoinGame(player1, player2, initAmount);

		System.out.println("GAME 1");
		System.out.println(" Initial Players Balance ");
		System.out.println(" Player 1: " + player1 + " Balance: " + g1.accountBalancePlayer1());
		System.out.println(" Player 2: " + player2 + " Balance: " + g1.accountBalancePlayer2());
		System.out.println();

		g1.turn();

		System.out.println(" Players Balance After 1 Turn ");
		System.out.println(" Player 1: " + player1 + " Balance: " + g1.accountBalancePlayer1());
		System.out.println(" Player 2: " + player2 + " Balance: " + g1.accountBalancePlayer2());
		System.out.println();

		player1 = "Alex";
		player2 = "Max";
		initAmount = 1000.0;
		int turns = 10;

		g1 = new CoinGame(player1, player2, initAmount);
		System.out.println("GAME 2");
		System.out.println(" Initial Players Balance ");
		System.out.println(" Player 1: " + player1 + " Balance: " + g1.accountBalancePlayer1());
		System.out.println(" Player 2: " + player2 + " Balance: " + g1.accountBalancePlayer2());
		System.out.println();

		g1.play(turns);

		System.out.println(" Players Balance After " + turns + " turns");
		System.out.println(" Player 1: " + player1 + " Balance: " + g1.accountBalancePlayer1());
		System.out.println(" Player 2: " + player2 + " Balance: " + g1.accountBalancePlayer2());
		System.out.println();
	}
}