import java.io.*;
import java.util.*;

public class CoinGame {
    private double pot = 0.0;
    private Coin c1 = new Coin();
    private Coin c2 = new Coin();
    private BankAccount p1 = new BankAccount("Bob", 1);
    private BankAccount p2 = new BankAccount("Dave", 2);
    private double maxAnte;

    public void setMaxAnte(BankAccount acct1, BankAccount acct2){
	maxAnte = acct1.getBalance();
	if (acct1.getBalance() > acct2.getBalance())
	    maxAnte = acct2.getBalance();
    }

    public void addToPot(double amt){
	p1.withdraw(amt);
	p2.withdraw(amt);
	pot = pot + (2.0 * amt);
    }

    public void turn(){
	setMaxAnte(p1,p2);
        int addAmt = (int)(100.0 * Math.random() * maxAnte);
	double t = ((double)(addAmt)) / 100.0;
	addToPot(t);

	c1.flip();
	c2.flip();

	if (c1.getFace().equals("Heads") && c2.getFace().equals("Heads")){
	    p1.deposit(pot);
	    pot = 0.0;
	}
	else if (c1.getFace().equals("Tails") && c2.getFace().equals("Tails")){
	    p2.deposit(pot);
	    pot = 0.0;
	}

	System.out.println("Player 1 has $" + p1.getBalance());
	System.out.println("Player 2 has $" + p2.getBalance());
	System.out.println("The current pot is $" + pot);
    }

    public void play(int n){
	//setup game
	p1.deposit(100.0);
	p2.deposit(100.0);
	System.out.println("Player 1 has $" + p1.getBalance());
	System.out.println("Player 2 has $" + p2.getBalance());

	//play game
	while (n > 0){
	    turn();
	    n = n - 1;
	}

	//split pot among players at end of game
	p1.deposit(pot/2.0);
	p2.deposit(pot/2.0);
	pot = 0.0;

	//report winner
	String winner = "Wins!";
	if (p1.getBalance() > p2.getBalance())
	    winner = "Player 1 " + winner;
	else if (p1.getBalance() < p2.getBalance())
	    winner = "Player 2 " + winner;
	else
	    winner = "It's A Tie!";
	System.out.println("");
	System.out.println("Player 1 finished the game with $" + p1.getBalance());
	System.out.println("Player 2 finished the game with $" + p2.getBalance());
	System.out.println(winner);
    }
}
