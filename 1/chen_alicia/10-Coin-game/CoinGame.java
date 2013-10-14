import java.io.*;
import java.util.*;

public class CoinGame{
    Coin c1 = new Coin();
    Coin c2 = new Coin();
    BankAccount p1 = new BankAccount("Alicia",123,500.00);
    BankAccount p2 = new BankAccount("Christina",456,500.00);
    double pot = 0;
    double amt = 0;

    public void addToPot(){
	amt = Math.random() * 10;
	p1.withdraw(amt);
	p2.withdraw(amt);
	pot = (amt * 2) + pot;
    }

    public String getBalances(){
	String r = "Player 1: " + p1.getBalance() + "\n" + "Player 2: " + p2.getBalance();
	return r;
    }

    public void turn(){
	addToPot();
	c1.flip();
	c2.flip();
	
	if (c1.getFace() == c2.getFace()) {
	    if (c1.getFace() == "Heads") {
		p1.deposit(pot);
		
		System.out.println("Pot Amount:" +  pot);
		System.out.println("Both coins were heads, p1 gets the pot");
		System.out.println(getBalances());
		pot = 0.00;
	    }
	    else {
		p2.deposit (pot);

		System.out.println("Pot Amount:" +  pot);
		System.out.println("Both coins were tails, p2 gets the pot");
		System.out.println(getBalances());
		pot = 0.00;

	    }
	    
	}
	else {
	    System.out.println("Coins were different. No one gets the pot");
	}
    }
    
    public void play (int n){
	while( n > 0) {
	    turn();
	    n = n-1;
	}
    }
    
    public String winner (){
	if (p1.getBalance() > p2.getBalance()) {
	    return "Congratulations! Player 1 wins";
	}
	else if (p1.getBalance ()  == p2.getBalance()) {
	    return "Tie";
	}
	else {
	    return "Congratulations! Player 2 wins";
	}
    }

}
