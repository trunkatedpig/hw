import java.io.*;
import java.util.*;

public class CoinGame{
    private double pot = 0.0;
    private Coin c1 = new Coin();
    private Coin c2 = new Coin();
    private BankAccount player1 = new BankAccount("Austen", 1);
    private BankAccount player2 = new BankAccount("Deanna", 2);
    private double maxAnte;

    public void setMaxAnte(BankAccount a1, BankAccount a2){
	maxAnte = a1.getBalance();
	if (a1.getBalance() > a2.getBalance())
	    maxAnte = a2.getBalance();
    }

    public void addToPot(double amt){
	player1.withdraw(amt);
	player2.withdraw(amt);
	pot = pot + (2.0 * amt);
    }

    public void turn(){
	setMaxAnte(player1,player2);
	int addAmt = (int)(100.0 * Math.random() * maxAnte);
	double addthis = ((double)(addAmt)) / 100.0;
	addToPot(addthis);

	c1.flip();
	c2.flip();
	
	if (c1.getFace().equals("Heads") && c2.getFace().equals("Heads")) {
	    player1.deposit(pot);
	    pot = 0.0;
	}

	else if (c1.getFace().equals("Tails") && c2.getFace().equals("Tails")){
	    player2.deposit(pot);
	    pot = 0.0;
	}

	System.out.println("Balances:");
	System.out.println("Player 1: $" + player1.getBalance());
	System.out.println("Player 2: $" + player2.getBalance());
	System.out.println("Pot: $" + pot);
    }

    public void play(int n){
	player1.deposit(100.0);
	player2.deposit(100.0);
	System.out.println("Player 1 has $" + player1.getBalance());
	System.out.println("Player 2 has $" + player2.getBalance());

	while (n > 0){
	    turn();
	    n = n - 1;
	}

	double endPot = pot/2.0;
	player1.deposit(endPot);
	player2.deposit(endPot);
	pot = 0.0;

	if (player1.getBalance() > player2.getBalance()){
	    System.out.println("--------------------");
	    System.out.println("Final Balances:");
	    System.out.println("Player 1: $" + player1.getBalance());
	    System.out.println("Player 2: $" + player2.getBalance());
	    System.out.println("PLAYER 1 WINS!");
	}
	else if (player1.getBalance() < player2.getBalance()){
	    System.out.println("--------------------");
	    System.out.println("Final Balances:");
	    System.out.println("Player 1: $" + player1.getBalance());
	    System.out.println("Player 2: $" + player2.getBalance());
	    System.out.println("PLAYER 2 WINS!");
	}
	else {
	    System.out.println("--------------------");
	    System.out.println("Final Balances:");
	    System.out.println("Player 1: $" + player1.getBalance());
	    System.out.println("Player 2: $" + player2.getBalance());
	    System.out.println("ITS A TIE!");
	}
    }
}
