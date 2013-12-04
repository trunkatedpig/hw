import java.io.*;
import java.util.*;

public class CoinGame {
    private Coin coin1, coin2;
    private double pot;
    private BankAccount player1, player2;

    public void turn() {
	double a = Math.random() * 1000;
	double b = Math.random() * 1000;
	
	pot = a + b;
	
	player1 = new BankAccount("1", 11111);
	player2 = new BankAccount("2", 22222);
	coin1 = new Coin();
	coin2 = new Coin();
	player1.withdraw (a);
	player2.withdraw (b);
	
	while (pot != 0) {
	    coin1.flip();
	    coin2.flip();
	    if (coin1.getFace() == "heads" && coin2.getFace() == "heads") {
		player1.deposit(pot);
		pot = 0;
	    }
	    else if (coin1.getFace() == "tails" && coin2.getFace() == "tails") {
		player2.deposit(pot);
		pot = 0;
	    }
	    System.out.println(coin1.getFace());
	    System.out.println(coin2.getFace());
	}
    }

    public void play (int n) {
	int r = 0;
	while (n > r) {
	    turn();
	    r = r + 1;
	    System.out.println("Player 1's balance: " + player1.getBalance());
	    System.out.println("Player 2's balance: " + player2.getBalance());
	}
    }
}
