import java.io.*;
import java.util.*;

public class CoinGame {

	private Coin coinOne;
	private Coin coinTwo;
	private BankAccount bankOne;
	private BankAccount bankTwo;
	private double pot;
	
	public CoinGame (BankAccount x, BankAccount y, Coin a, Coin b) {
		bankOne = x;
		bankTwo = y;
		coinOne = a;
		coinTwo = b;
		
	}
	
	public void createPot() {
		//double p = pot ;
		
		Random r = new Random();
		int bet = r.nextInt(100);
		bankOne.withdraw(bet);
		bankTwo.withdraw(bet);
		pot = bet + bet;		
	}
	
	public void flipCoin () {
		//if (bankOne.getBalance() > 0 && bankTwo.getBalance() > 0) {
		coinOne.flip();
		coinTwo.flip();
		//}
	}
	
	public String flipResults () {
		if (coinOne.getFace().equals("Heads") && coinTwo.getFace().equals("Heads")) {
			bankOne.deposit(pot);
			return "Two Heads were flipped. The winner is Player 1.";
		}
		else if (coinOne.getFace().equals("Tails") && coinTwo.getFace().equals("Tails")) {
			bankTwo.deposit(pot);
			return "Two Tails were flipped. The winner is Player 2.";
		}
		else {
			return coinOne.getFace() + " and " + coinTwo.getFace() + " were flipped." + "\n" + "Noone Won. Money stays in pot";
		}
	}
	
	public String status() {
		return "Pot has " + pot + " dollars." + " Buy in set at " + pot/2 + " dollars." + "\n" + this.flipResults() + "\n"
		+ "Player 1 has " + bankOne.getBalance() + "dollars" + "\n" 
		+ "Player 1 has " + bankTwo.getBalance() + "dollars"; 
		
	
	}

	public String turn() {
		
		this.createPot();
		this.flipCoin();
		return this.status();
		
	}
	
		
	public void play (int n) {
				
		while (n > 0) {
			this.turn();
			n = n - 1;
			
		}
		
	}

}