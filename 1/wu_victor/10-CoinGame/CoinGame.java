import java.io.*;
import java.util.*;

public class CoinGame {

    private BankAccount playerOne, playerTwo;
    private Coin cOne, cTwo;
    private double pot;
    private int s;

    public CoinGame () { 
	pot = 0;
    }
    
    public void turn () {	
	// To set up the Pot
	Random r = new Random();
	s = 10 + r.nextInt(11);
        pot = pot + s + s;
	playerOne.withdraw(s);
	playerTwo.withdraw(s);

	// To flip the coins
	cOne.flip();
	cTwo.flip();

	// Turn
	if (cOne.getFace().equals(cTwo.getFace())) {
	    if (cOne.getFace().equals("Heads")) {
		playerOne.deposit(pot);
		pot = 0;
	    }
	    else {
		playerTwo.deposit(pot);
		pot = 0;
	    }
	}	
    }
    
    public void play (int n) {
	while (n > 0) {
	    turn();
	    n = n - 1;
	}
    }

    // Helper Functions

    public String retPot () {
	return "The pot contains" + " " + pot;
    }

    public String retOne () {
	return "Player 1 has" + " " + playerOne.getBalance();
    }

    public String retTwo () {
	return "Player 2 has" + " " + playerTwo.getBalance();
    }

    public void setBank (BankAccount a, BankAccount b) {
	playerOne = a;
	playerTwo = b;
    }

    public void setCoin (Coin a, Coin b) {
	cOne = a;
	cTwo = b;
    }

}
