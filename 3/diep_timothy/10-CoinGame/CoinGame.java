import java.io.*;
import java.util.*;

public class CoinGame {
    private BankAccount p1,p2,pot;
    private Coin c1,c2;

    public CoinGame(String n1, String n2) {
	p1 = new BankAccount();
	p2 = new BankAccount();
	pot = new BankAccount();
	p1.balance = 100.00;
	p1.name = n1;
	p2.balance = 100.00;
	p2.name = n2;
	pot.balance = 0.00;

	c1 = new Coin();
	c2 = new Coin();
    }
	
    public void turn() {
	Random r = new Random();
	double bet = r.nextInt(1000) / 100.0;

	if (bet > p1.balance) {
	    p1.giveMoneyTo(pot,p1.balance);
	} else {
	    p1.giveMoneyTo(pot,bet);
	}

	if (bet > p2.balance) {
	    p2.giveMoneyTo(pot,p2.balance);
	} else {
	    p2.giveMoneyTo(pot,bet);
	}

	if (c1.getFace().equals(c2.getFace()) && c1.getFace().equals("Heads")) {
	    pot.giveMoneyTo(p1,pot.balance);
	    if (p2.balance == 0.0) {
		endgame(p1,p2);
	    } else {
		result(p1,p2);
	    }
	} else if (c1.getFace().equals(c2.getFace()) && c1.getFace().equals("Tails")) {
	    pot.giveMoneyTo(p2,pot.balance);
	    if (p1.balance == 0.0) {
		endgame(p2,p1);
	    } else {
		result(p2,p1);
	    }
	} else {
	    result();
	}
    }
	
    public void play(int n) {
	while (n != 0) {
	    turn();
	    n = n - 1;
	}
    }

    public void ScoreCheck() {
	System.out.println("Score Check: " + p1.name + ": $" + p1.getBalance() + ", " + p2.name + ": $" + p2.getBalance() + ", Pot: $" + pot.getBalance());
    }	    

    public void result() {
	System.out.println("Tie! Amount in pot: $" + pot.getBalance());
	System.out.println();
    }

    public void result(BankAccount win, BankAccount lose) {
	String x =  win.name + " wins! Score: " + win.name + ": $" + win.getBalance() + ", " + lose.name + ": $" + lose.getBalance();
	System.out.println(x);
	System.out.println();
    }
    public void endgame(BankAccount win, BankAccount lose) {
	String x = win.name + " wins! Final Score: " + win.name + ": $" +  win.getBalance() + ", " + lose.name + ": $" + lose.getBalance();
	System.out.println(x);
	System.out.println();
    }
	
}
