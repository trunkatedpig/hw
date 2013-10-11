import java.io.*;
import java.util.*;

public class CoinGame {
    
    private int pot;
    private Coin c;

    public CoinGame () { 
	pot = 0;
    }

    public int createPot (BankAccount a, BankAccount b) {
	pot = pot + a.withdraw(1) + b.withdraw(1);
	return pot;
    }

    public String playGame () {
	String a, b;
	a = c.flip();
	b = c.flip();

	if (a.equals("Heads") && b.equals("Heads")) {
	    a.deposit(pot);
	    pot = 0;
	    return "Player 1 Wins";
	}
	else if (a.equals("Tails") && b.equals("Tails")) {
	    b.deposit(pot);
	    pot = 0;
	    return "Player 2 Wins";
	}
	else {
	    
	
    }
	

}