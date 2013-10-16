import java.util.*;
import java.io.*;

public class CoinGame {
    private int  pot;
    private BankAccount p1,p2;
    private Coin c1,c2;
    private boolean gameOver;
    private BankAccount winner;

    public CoinGame() {
	p1 = new BankAccount("p1", 1);
	p2 = new BankAccount("p2", 2);
	c1 = new Coin();
	c2 = new Coin();
	
	
    }

    public void turn() {
	int least, amount;
	Random r = new Random();
	amount = r.nextInt(10);
	if (p1.getBalance() == 0 || p1.getBalance() < amount) {
	    winner = p2;
	    p2.deposit(pot);
	    gameOver = true;
	    return;
	}
	if (p2.getBalance() == 0 || p2.getBalance() < amount) {
	    winner = p1;
	    p1.deposit(pot);
	    gameOver = true;
	    return;
	}
	p1.withdraw(amount);
	p2.withdraw(amount);
	pot = pot + amount + amount;
	c1.flip();
	c2.flip();
	if (c1.getFace() == "heads" && c2.getFace() == "heads") {
	    p1.deposit(pot);
	    pot = 0;
	} else if (c1.getFace() == "tails" && c2.getFace() == "tails") {
	    p2.deposit(pot);
	    pot = 0;
	}
    }

    
    public void play(int n) {
	while (n > 0 && !gameOver) {
	    turn();
     	    n = n - 1;
	}
	if (gameOver) {
	    if (p1.getBalance() > p2.getBalance()) {
		System.out.println("Hooray for P1! Hooray for him!");
	    } else {
		System.out.println("Hooray for P2! Hooray for him!");
	    }
	}
    }


    public double getP1Balance() {
	return p1.getBalance();
    }

    public double  getP2Balance() {
	return p2.getBalance();
    }
    
    public int getPot() {
	return pot;
    }

    public boolean getGameOver() {
	return gameOver;
    }
    

}
