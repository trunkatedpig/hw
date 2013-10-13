import java.io.*;
import java.util.*;
import java.text.*;

public class CoinGame {
    private BankAccount account1, account2;
    private Coin coin1, coin2;
    private double pot = 0.0;

    public CoinGame() {
	account1 = new BankAccount("player1", 1);
	account2 = new BankAccount("player2", 2);
	account1.deposit(1000.00);
	account2.deposit(1000.00);
	coin1 = new Coin();
	coin2 = new Coin();
	pot = 0.0;
    }

    public void turn() {
	double temp1 = Math.random() * 100,
	    temp2 = Math.random() * 100,
	    bal1 = account1.getBalance(),
	    bal2 = account2.getBalance();
	if (temp1 < bal1) {
	    account1.withdraw(temp1);
	    pot = pot + temp1;
	} else {
	    account1.withdraw(bal1);
	    pot = pot + bal1;
	}
	if (temp2 < bal2) {
	    account2.withdraw(temp2);
	    pot = pot + temp2;
	} else {
	    account2.withdraw(bal2);
	    pot = pot + bal2;
	}
	coin1.flip();
	coin2.flip();
	if (coin1.getFace().equals(coin2.getFace())) {
	    if (coin1.getFace().equals("heads")) {
		account1.deposit(pot);
		pot = 0;
	    } else {
		account2.deposit(pot);
		pot = 0;
	    }
	}
    }


    public void play(int n) {
	while (n > 0) {
	    turn();
	    n = n - 1;
	    if (account1.getBalance() == 0 || account2.getBalance() == 0)
		n = 0;
	}
    }

    public String returnWinner() {
	double bal1 = account1.getBalance();
	double bal2 = account2.getBalance();
	DecimalFormat df = new DecimalFormat("#.##");
	if (bal1 > bal2)
	    return "Player 1 wins with $" + df.format(bal1) + " against Player 2's $" + df.format(bal2) + ". \n Total: $" + df.format(bal1+bal2);
	else
	    return "Player 2 is wins with $" + df.format(bal2) + " against Player 1's $" + df.format(bal1) + ".\n  Total: $" + df.format(bal1+bal2);
    }

}
