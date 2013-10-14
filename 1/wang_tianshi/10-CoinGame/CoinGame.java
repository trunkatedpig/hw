import java.io.*;
import java.util.*;

public class CoinGame {
    private Coin c1 = new Coin();
    private Coin c2 = new Coin();
    private BankAccount b1 = new BankAccount ("P1", 1);
    private BankAccount b2 = new BankAccount ("P2", 2);
    private double pot;
	
    public void turn() {
	double Balance1 = b1.getBalance();
	double Balance2 = b2.getBalance();
	int x;
	/* I really had trouble here. For some reason, when I tried to make 
	   x into a double by multiplying it by 100, converting it into an Int, 
	   and then dividing by 100 again, I would get a long trail of 9's or 0's.*/
	if (Balance1 > Balance2) {
	    x = (int)(Math.random() * Balance2);
	}
	else {
	    x = (int)(Math.random() * Balance1);
	}
	b1.withdraw(x);
	b2.withdraw(x);
	pot = pot + 2*x;
	c1.flip();
	c2.flip();
	if (c1.getFace().equals("Heads") && 
	    c2.getFace().equals("Heads")) {
	    b1.deposit(pot);
	    pot = 0;
	}
	else if (c1.getFace().equals("Tails") &&
		 c2.getFace().equals("Tails")) {
	    b2.deposit(pot);
	    pot = 0;
	}
	System.out.println("P1: " + b1.getBalance());
	System.out.println("P2: " + b2.getBalance());
    }
    
    public void play(int n) {
	b1.deposit (100);
	b2.deposit (100);
	System.out.println("P1: " + b1.getBalance());
	System.out.println("P2: " + b2.getBalance());
	while (n>0){
	    n = n-1;
	    turn();
	}
	System.out.println("P1 has $" +b1.getBalance()+ " in his balance!");
	System.out.println("P2 has $" +b2.getBalance()+ " in his balance!");
	if (b1.getBalance() > b2.getBalance()) {
	    System.out.println("P1 Wins!");
	}
	else if (b2.getBalance() > b1.getBalance()) {
	    System.out.println("P2 Wins!");
	}
	else {
	    System.out.println("P1 and P2 are tied!!");
	}		   
    }
}

	    
	    
	    
