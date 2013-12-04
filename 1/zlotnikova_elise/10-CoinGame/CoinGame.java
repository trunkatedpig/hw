import java.io.*;
import java.util.*;

public class CoinGame {
    BankAccount Bank1 = new BankAccount("Bank1",1,50.0);
    BankAccount Bank2 = new BankAccount("Bank2",2,50.0); 
    Coin c1 = new Coin(25);
    Coin c2 = new Coin(25); 
    private int pot; 

    public CoinGame() {
	pot = 0;
    } 
    
    public int getPot() {
	return pot;
    }

    public void setPot() {
	int x = (int)(Math.random() * 10);
	while (x > Bank1.getBalance() || x > Bank2.getBalance())
	    x = (int)(Math.random() * 10);
	Bank1.withdraw(x); 
	Bank2.withdraw(x); 
	pot = pot+(x * 2);
    }

    public void turn() {
	setPot();
	c1.flip();
	c2.flip();
	if (c1.equals(c2) && c1.getFace().equals("Heads")){
	    Bank1.deposit(pot);
	    pot = 0;
	}
	else {
	    if (c1.equals(c2) && c1.getFace().equals("Tails")){
		Bank2.deposit(pot);
		pot = 0;
	    }
	    else {
		pot = pot;
	    }
	}
    }

    public String getBalances() {
	String s = "Player 1: " + Bank1.getBalance() + "\n" + "Player 2: " + Bank2.getBalance();
	return s; 
    }
	
    public void play(int n) {
	while (n>0) {
	    turn();
	    n = n-1;
	}
    }
    
    public String winner() {
	if (Bank1.getBalance() > Bank2.getBalance()){ 
	    return "Player 1 is winning";
	}
	else if (Bank2.getBalance() > Bank1.getBalance()){
	    return "Player 2 is winning";
	}
	else {
	    return "It's a tie!";
	}
    }
}
