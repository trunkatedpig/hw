import java.io.*;
import java.util.*;

public class CoinGame {
    private double pot = 0;
    private double ante = 0;
	private int turn = 0;
    private BankAccount p1;
    private BankAccount p2;
    private Coin c1;
    private Coin c2;
    
	public CoinGame(double newpot, double newante, BankAccount a, BankAccount b, Coin coin1, Coin coin2) {
		pot = newpot;
		ante = newante;
		p1 = a;
		p2 = b;
		c1 = coin1;
		c2 = coin2;
    }

    public void turn() {
		if (p1.getBalance() == 0) {
			System.out.println(p1.getName() + " is bankrupt!");
			return;
		}
		if (p2.getBalance() == 0) {
			System.out.println(p2.getName() + " is bankrupt!");
			return;
		}
		
		
		turn = turn + 1;
		System.out.println("Turn " + turn);
		
		if (ante <= p1.getBalance() && ante <= p2.getBalance()) {
			pot = pot + (2 * ante);
			p1.withdraw(ante);
			p2.withdraw(ante);
		}
		else {
			if (p1.getBalance() < p2.getBalance()) {
			ante = p1.getBalance();
			pot = pot + (2 * ante);
			p1.withdraw(ante);
			p2.withdraw(ante);
			}
			if (p1.getBalance() > p2.getBalance()) {
			ante = p2.getBalance();
			pot = pot + (2 * ante);
			p1.withdraw(ante);
			p2.withdraw(ante);
			}
		}
		
		System.out.println("Ante: " + ante + " paid by both players.");
		c1.flip();
		c2.flip();
		System.out.println(p1.getName() + ": " + c1.getFace());
		System.out.println(p2.getName() + ": " + c2.getFace());
		
		if (!c1.getFace().equals(c2.getFace())) {
			System.out.println("No winner: the pot is kept.");
			System.out.println("Pot: " + pot);
			System.out.println(p1.getName() + " balance: " + p1.getBalance());
			System.out.println(p2.getName() + " balance: " + p2.getBalance());
		}
		else {
			if (c1.getFace().equals("heads") && c2.getFace().equals("heads")) {
				p1.deposit(pot);
				System.out.println("Both heads: " + p1.getName() + " wins " + pot);
				pot = 0;
				System.out.println("Pot: " + pot);
				System.out.println(p1.getName() + " balance: " + p1.getBalance());
				System.out.println(p2.getName() + " balance: " + p2.getBalance());
			}
			if (c1.getFace().equals("tails") && c2.getFace().equals("tails")) {
				p2.deposit(pot);
				System.out.println("Both heads: " + p2.getName() + " wins " + pot);
				pot = 0;
				System.out.println("Pot: " + pot);
				System.out.println(p1.getName() + " balance: " + p1.getBalance());
				System.out.println(p2.getName() + " balance: " + p2.getBalance());
			}
		}
		
		System.out.println("");
		
    }
	
	public void play (int n) throws InterruptedException {
		while (n > 0) {
			if (p1.getBalance() == 0 && p2.getBalance() == 0) {
			System.out.println("Everyone is bankrupt!");
			break;
		}
			if (p1.getBalance() == 0) {
			System.out.println(p1.getName() + " is bankrupt!");
			break;
		}
		if (p2.getBalance() == 0) {
			System.out.println(p2.getName() + " is bankrupt!");
			break;
		}
			turn();
			
			//super ante
		if (p1.getBalance() > p2.getBalance()) {
			ante = ante + p1.getBalance() * 0.2;
		}
		if (p2.getBalance() > p1.getBalance()) {
			ante = ante + p2.getBalance() * 0.2;
		}
		if (p1.getBalance() == p2.getBalance()) {
			ante = ante * 1.2;
		}
			
			Thread.sleep(1000);
			n = n - 1;
		}
	}
	
	
}
