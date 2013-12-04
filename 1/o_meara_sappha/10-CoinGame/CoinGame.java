import java.io.*;
import java.util.*;

public class CoinGame {
    BankAccount player1 = new BankAccount(acct1, 500);
    BankAccount player 2 = new BankAccount(acct2, 500);
    Coin c1 = new Coin();
    Coin c2 = new Coin();
    int pot = 0;
    
    public int getAcct1() {
	return acct1.getBalance();
    }
    
    public int getAcct2() {
	return acct2.getBalance();
    }

    public void turn() {
	if (pot = 0) {
	    acct1.withdraw(Math.random * 100);
	    acct2.withdraw(Math.random * 100);
	}
	String flip1 = c1.flip();
	String flip2 = c2.flip();
	if (flip1.equals("Heads") && flip2.equals("Heads")) {
	    acct1.deposit(pot);
	    pot = 0;
	}
	else if (flip1.equals("Tails") && flip2.equals("Tails")) {
	    acct2.deposit(pot);
	    pot = 0;
	}
    }
    
    public void play(int n) {
	while (n > 0) {
	    turn();
	    n = n - 1;
	}
    }
    
}
