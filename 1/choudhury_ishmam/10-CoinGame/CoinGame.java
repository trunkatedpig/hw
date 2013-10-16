import java.io.*;
import java.util.*;

public class CoinGame {
	private int pot; 
	private BankAccount A = new BankAccount ("Edison", 10000);
	private BankAccount B = new BankAccount ("Tesla", 10000);
	private Coin X = new Coin(0.25, "Quarter");
	private Coin Y = new Coin(0.25, "Quarter");
	private Random R = new Random();
	
	
	public CoinGame() {
		A.deposit(10000);
		B.deposit(10000);
	}
	
	
	public void turn() {
	
	//Pre-turn, adding to the pot
	int ap = 0;
	if 
		(A.getBal() > B.getBal() ) 
			{
				ap = R.nextInt( (int) (B.getBal() ) );
			}
	else {
		ap = R.nextInt ( (int) (A.getBal() ) );
		}
	
	pot = pot + ap + ap;
	A.withdraw(ap);
	B.withdraw(ap);
	
	//Mid-turn, flipping the coins
	X.flip();
	Y.flip(); 
	
	//After flips
	if (X.getFace() == "Heads" && 
		Y.getFace() == "Heads" ) 
		{
		A.deposit(pot);
		}
	
	else if (X.getFace() == "Heads" && 
			Y.getFace() == "Heads" ) 
		{
		B.deposit(pot);
		}
	}
	
	//get functions
	
	public String getFaces() {
		return X.getFace() 
		+ "\n"
		+ Y.getFace(); 
	}
	
	public String getBalances() {
		return "A: " + A.getBal() +
				"\n" +
				"B: " + B.getBal();
	}
	
	public int getPot() {
		return pot;
	}
}