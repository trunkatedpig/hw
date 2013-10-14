import java.util.*;
import java.io.*;

public class CoinGame {
    // Creating two players, each represented by a bank account
    BankAccount p1 = new BankAccount("aida", 111, 100.0);
    BankAccount p2 = new BankAccount("emily",222, 100.0);

    // Creating two new coins, with face of "Heads" and a prob of 0.5
    Coin a = new Coin();
    Coin b = new Coin();

    // Creates new double pot
    private double pot = 0;

    public void setPot() {
	Random rand = new Random();
	double r1 = rand.nextInt(10);
	double r2 = rand.nextInt(10);
	p1.withdraw(r1);
	p2.withdraw(r2);
	pot = pot + r1 + r2;
    }

    public void turn() {
        a.flip();
	b.flip();
	String aFace = a.getFace();
	String bFace = b.getFace();
	if ((aFace.equals("heads") && (bFace.equals("heads")))) {
	    p1.deposit(pot);
	    pot = 0;
	}
	if ((aFace.equals("tails") && (bFace.equals("tails")))) {
	    p2.deposit(pot);
	    pot = 0;
	}
    }
    
    public void play(int n) {
	setPot();
	while (n != 0) {
	    turn();
	    n = n - 1;
	}
    }

    public double getPot() {
	return pot;
    }
    
    public String getBankAccounts() {
	return "p1 has " + String.valueOf(p1.getBalance()) + "\np2 has " + String.valueOf(p2.getBalance());
    }
}

