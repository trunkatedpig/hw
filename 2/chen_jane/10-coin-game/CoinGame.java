import java.io.*;
import java.util.*;


public class CoinGame {
    private BankAccount player1,player2;
    private Coin coin1,coin2;
    private double pot;
    private int turn;

    public CoinGame(BankAccount p1,BankAccount p2,Coin c1,Coin c2) {
	player1 = p1;
	player2 = p2;
	coin1 = c1;
	coin2 = c2;
	turn = 0;
    }

    public CoinGame(BankAccount p1,BankAccount p2,Coin c1,Coin c2,double n) {
	player1 = p1;
	player2 = p2;
	coin1 = c1;
	coin2 = c2;
	turn = 0;
    }

    public void initPot() {
	double n;
	n = Math.min(player1.getBalance(),player2.getBalance());
	n = Math.floor(n * Math.random());
	pot = n * 2;
	player1.withdraw(n);
	player2.withdraw(n);
    }

    public void initPot(double n) {
	if (player1.getBalance() >= n && player2.getBalance() >= n) {
	    pot = n * 2;
	    player1.withdraw(n);
	    player2.withdraw(n);
	}
    }

    public void addToPot() {
	if (player1.getBalance() >= 10.0 && player2.getBalance() >= 10.0) {
	    player1.withdraw(10);
	    player2.withdraw(10);
	    pot = pot + 20;
	}
	else {
	    double minBet = Math.min(player1.getBalance(),player2.getBalance());
	    pot = pot + minBet*2;
	    player1.withdraw(minBet);
	    player2.withdraw(minBet);
	}
    }

    public void addToPot(double n) {
	if (player1.getBalance() >= n && player2.getBalance() >= n) {
	    player1.withdraw(n);
	    player2.withdraw(n);
	    pot = pot + n*2;
	}
	else {
	    // if a player doesn't have enough money to make the full bet, 
	    // being the gambler that he is, he decides to bet his life's earnings
	    double minBet = Math.min(player1.getBalance(),player2.getBalance());
	    pot = pot + minBet*2;
	    player1.withdraw(minBet);
	    player2.withdraw(minBet);
	}
    }

    public void turn() {
	coin1.flip();
	coin2.flip();
	turn = turn + 1;
	if (coin1.getFace() == "Heads" && coin2.getFace() == "Heads") {
	    player1.deposit(getPot());
	    pot = 0;
	    initPot();

	}
	else if (coin1.getFace() == "Tails" && coin2.getFace() == "Tails") {
	    player2.deposit(getPot());
	    pot = 0;
	    initPot();
	}
	else {
	    // no one wins this round
	    addToPot();
	}
    }

    public void play(int n) {
	while (n > 0) {
		if (player1.getBalance() > 0 && player2.getBalance() > 0) {
		    turn();
		    n = n - 1;
		}
		else {
		    break;
		}
	    }
    }

    public String currentValues() {
	return "Player 1's current balance: " + player1.getBalance() + "\n" + 
	    "Player 2's current balance: " + player2.getBalance() + "\n" +
	    "Current pot: " + getPot();
    }

    public double getPot() {
	return pot;
    }

    public int getTurn() {
	return turn;
    }

    public String announceWinner() {
	// assuming there will never be a tie
	String ans;
	if (player1.getBalance() == 0) {
	    ans = "The winner is Player 2!";
	}
	else if (player2.getBalance() == 0) {
	    ans = "The winner is Player 1!";
	}
	else {
	    ans = "There's no winner yet; they can keep on playing!";
	}
	return ans;
    }
}
