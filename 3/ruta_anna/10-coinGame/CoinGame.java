import java.io.*;
import java.util.*;

public class CoinGame {

	private BankAccount p1, p2;
	private Coin c1, c2;
	private double pot;
	private double rand;

/* Initializes the CoinGame with an input of both player names and starting ammount for each player */
	public CoinGame(String name1, String name2, double initAmount) {
		p1 = new BankAccount(name1,1);
		p1.deposit(initAmount);
		p2 = new BankAccount(name2,2);
		p2.deposit(initAmount);
		c1 = new Coin();
		c2 = new Coin();
		pot = 0;
	}

/* Creates random function for variable */
		Random generator = new Random();


	public double accountBalancePlayer1(){
		return getTwoDecimals(p1.getBalance());
	}

	public double accountBalancePlayer2() {
		return getTwoDecimals(p2.getBalance());
	}


	public void createPot(){
		rand = generator.nextDouble();
		double withdrawAmount = Math.min(p1.getBalance(),p2.getBalance());
		withdrawAmount = withdrawAmount * rand;
		if (withdrawAmount > 0) {
			withdrawAmount = getTwoDecimals(withdrawAmount);
			p1.withdraw(withdrawAmount);
			p2.withdraw(withdrawAmount);
			pot = pot + withdrawAmount + withdrawAmount;
		}
	}

	public double getTwoDecimals(double n) {
		return ((int) (n * 100)) / 100.0;
	}

	public void turn(){
		createPot();
		rand = generator.nextDouble();
		c1.setCurrentFace(rand);
		c1.flipCoin();
		rand = generator.nextDouble();
		c2.setCurrentFace(rand);
		c2.flipCoin();
		if (c1.getFace() == c2.getFace()) {
			if (c1.getFace() == "Heads") {
				p1.deposit(pot);
			} else {
				p2.deposit(pot);
			}
			pot = 0;
		}
	}

	public void play(int n){
		int w = 0;
		while (w < n){
			turn();
			w = w + 1;
		}
	}



	}