import java.io.*;
import java.util.*;

public class CoinGame {

    private BankAccount p1, p2;
    private Coin c1, c2;
    private double pot;

    public CoinGame(BankAccount player1, BankAccount player2) {
	p1 = player1;
	p2 = player2;
	c1 = new Coin();
	c2 = new Coin();
	pot = 0.0;
    }

    public void turn() {
	double money1, money2;
	money1 = Math.random()*p1.getBalance();
	money2 = Math.random()*p2.getBalance();

	p1.withdraw(money1);
	p2.withdraw(money2);
	pot = pot + money1 + money2;
	c1.flip();
	c2.flip();

	if ((c1.getFace() == "head") && (c2.getFace() == "head")) {
	    p1.deposit(pot);
	    pot = 0;
	}
	else if ((c1.getFace() == "tail") && (c2.getFace() == "tail")) {
	    p2.deposit(pot);
	    pot = 0;
	}
    }

    public void play(int n) {
	while (n > 0) {
	    turn();
	    n = n - 1;
	}
    }

    public String status() {
	String message;
	double amt;

	message = "Player 1 has $" + p1.getBalance() + ".\n";
	message = message + "Player 2 has $" + p2.getBalance() + ".\n";

	if (p1.getBalance() > p2.getBalance()) {
	    amt = p1.getBalance() - p2.getBalance();
	    message = message + "Player 1 is winning by $" + amt + ".";
	}
	else if (p2.getBalance() > p1.getBalance()) {
	    amt = p2.getBalance() - p1.getBalance();
	    message = message + "Player 2 is winning by $" + amt + ".";
	}
	else if (p1.getBalance() == p2.getBalance()) {
	    message = message + "Both players have the same amount of money, it's a tie";
	}
	
	return message;
    }

}