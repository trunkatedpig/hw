import java.io.*;
import java.util.*;

public class CoinGame {

    private Coin c1, c2;
    private BankAccount p1, p2;
    private double pot;

    public CoinGame (BankAccount ba1, BankAccount ba2) {
	c1 = new Coin();
	c2 = new Coin();
	p1 = ba1;
	p2 = ba2;
	pot = 0;
    }

    public String status() {
	return p1.getName() + ": " + p1 + "\n" + p2.getName() + ": " + p2 + "\nPot: " + pot + "\n----------------------------------------------------";
    }

    public void turn() {
	double amt = Math.random();
	if (p1.getBalance() >= amt && p2.getBalance() >= amt) {
	    pot += 2 * amt;
	    p1.withdraw(amt);
	    p2.withdraw(amt);
	}
	c1.flip();
	c2.flip();
	if (c1.getFace().equals(c2.getFace())) {
	    if (c1.getFace().equals("Heads"))
		p1.deposit(pot);
	    else
		p2.deposit(pot);
	    pot = 0;
	}
    }

    public void play (int n) {
	while (n > 0) { 
	    turn();
	    n -= 1;
	}
    }
}