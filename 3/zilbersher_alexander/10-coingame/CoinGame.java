import java.io.*;
import java.util.*;

public class CoinGame {
    private double pot = 0;
    private Coin c1, c2;
    private BankAccount b1, b2;
    private int turns = 0;

    public CoinGame() {
	pot = 0;
	turns = 0;
	b1 = new BankAccount("Player1",1);
	b2 = new BankAccount("Player2",2);
	c1 = new Coin();
	c2 = new Coin();
    }
    
    public void turn() {
	double ante = 10;
	if (b1.getBalance() > ante) {
	    b1.withdraw(ante);
	    pot = pot + ante;
	} else {
	    b1.withdraw(b1.getBalance());
	    pot = pot + b1.getBalance();
	}
	if (b2.getBalance() > ante) {
	    b2.withdraw(ante);
	    pot = pot + ante;
	} else {
	    b2.withdraw(b2.getBalance());
	    pot = pot + b2.getBalance();
	}
	c1.flip();
	c2.flip();
	if (c1.getFace().equals("Heads") && c2.getFace().equals("Heads")) {
	    b1.deposit(pot);
	    pot=0;
	} else if (c1.getFace().equals("Tails") && c2.getFace().equals("Tails")) {
	    b2.deposit(pot);
	    pot=0;
	}
	turns = turns + 1;
    }

    public void play(int n) {
	while (n > 0) { 
	    if (b1.getBalance() > 0 && b2.getBalance() > 0) {
		n = n - 1;
		turn();
	    } else {
		n = n - 1;
	    }
	}
    }

    // \n is a return 
    public String results() { 
	String output = "Results\n";
	output = output + "Player 1 Score: " + b1.getBalance() + "\n";
	output = output + "Player 2 Score: " + b2.getBalance() + "\n";
	output = output + "Turns: " + turns + "\n";
	output = output + "Pot: " + pot;
	return output;
    }
}
