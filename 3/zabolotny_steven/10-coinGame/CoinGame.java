import java.io.*;
import java.util.*;

public class CoinGame {
    private BankAccount Player1;
    private BankAccount Player2;
    private Coin Coin1;
    private Coin Coin2;
    private double Pot;
    private int Turns;
    
    public void turn() {
	if (Pot == 0) {
	    Random r = new Random();
	    int p = r.nextInt(Math.max((int)Player1.getBalance(),(int)Player2.getBalance())) + 1;
	    Pot = p;}
	Player1.withdraw(p);
	Player2.withdraw(p);
	Coin1.flip();
	String Flip1 = Coin1.getFace();
	Coin2.flip();
	String Flip2 = Coin2.getFace();
	//Player 1 Wins, he gets the pot
	if (Flip1.equals("Heads") && Flip2.equals("Heads")) {
	    Player1.takeMoneyFrom(Player2,Pot);
	    Pot = 0;}
	//Player 2 Wins, he gets the pot
	else if (Flip1.equals("Tails") && Flip2.equals("Tails")) {
	    Player2.takeMoneyFrom(Player1,Pot);
	    Pot = 0;}
	//Nobody wins, nothing happens, pot remains
	Turns = Turns + 1;
    }

    public void play(int n) {
	if (Player1.getBalance() != 0 && Player2.getBalance() != 0) {
	    while (n > 0) {
		turn();
		n = n - 1;
		if (Player1.getBalance() == 0 || Player2.getBalance() == 0)
		    n = 0;
	    }
	}
    }

    public String results() {
	String results = "COIN GAME RESULTS\n";
	results = results + "TURNS = " + Turns + "\n";
	results = results + "PLAYER 1 BALANCE = " + Player1.getBalance() + "\n";
	results = results + "PLAYER 2 BALANCE = " + Player2.getBalance() + "\n";
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
	Turns = 1;
    }
}