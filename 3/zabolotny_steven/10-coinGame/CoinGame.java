import java.io.*;
import java.util.*;

public class CoinGame {
    private BankAccount Player1;
    private BankAccount Player2;
    private Coin Coin1;
    private Coin Coin2;
    private double Pot;
    private double PrevPot;
    private int Turns;
    
    public void turn() {
        double bal1 = Player1.getBalance();
	double bal2 = Player2.getBalance();
	Random r = new Random();
	//Note this line below is crucial in that it ensures that the random amount the pot takes is no more than the smaller of the two balances. This means no one can go negative from this game.
	double p = r.nextInt(Math.min((int)(bal1 - Pot/2),(int)(bal2 - Pot/2)));
	Pot = Pot + p;
	Player1.withdraw(p/2);
	Player2.withdraw(p/2);
	Coin1.flip();
	String Flip1 = Coin1.getFace();
	Coin2.flip();
	String Flip2 = Coin2.getFace();
	//Player 1 Wins, he gets the pot
	if (Flip1.equals("Heads") && Flip2.equals("Heads")) {
	    Player1.deposit(Pot);
	    PrevPot = Pot;
	    Pot = 0;}
	//Player 2 Wins, he gets the pot
	else if (Flip1.equals("Tails") && Flip2.equals("Tails")) {
	    Player2.deposit(Pot);
	    PrevPot = Pot;
	    Pot = 0;}
	//Nobody wins, nothing happens, pot remains
	Turns = Turns + 1;
    }

    public void play(int n) {
	if (Player1.getBalance() > 0 && Player2.getBalance() > 0) {
	    while (n > 0) {
		turn();
		n = n - 1;
		if (Player1.getBalance() <= 0 || Player2.getBalance() <= 0)
		    n = 0;
	    }
	}
    }

    public String results() {
	String results = "COIN GAME RESULTS\n";
	results = results + "TURNS = " + Turns + "\n";
	results = results + "PLAYER 1 BALANCE = " + Player1.getBalance() + "\n";
	results = results + "PLAYER 2 BALANCE = " + Player2.getBalance() + "\n";
	results = results + "PREVIOUS POT = " + PrevPot + "\n";
	results = results + "POT = " + Pot + "\n";
	return results;
    }

    public CoinGame() {
	Player1 = new BankAccount("Player1",1);
	Player1.deposit(100);
	Player2 = new BankAccount("Player2",2);
	Player2.deposit(100);
	Coin1 = new Coin();
	Coin2 = new Coin();
	Pot = 0;
	PrevPot = 0;
	Turns = 0;
    }
}