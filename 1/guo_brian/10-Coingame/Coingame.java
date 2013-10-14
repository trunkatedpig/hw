import java.io.*;
import java.util.*;

public class Coingame {
    
    private Coin a,b;
    private BankAccount A,B;
    private double pot;
    
    public void turn(){
	pot = A.withdraw(Math.random() * 100) + B.withdraw(Math.random() * 100);
	while (pot > 0) {
	    A.flip();
	    B.flip();
	    if (a.getface() == "heads" && b.getface() == "heads") {
		A.deposit(pot);
		pot = 0;
	    }
	    else if (a.getface() == "tails" && b.getface() == "tails") {
		B.deposit(pot);
		pot = 0;
	    }
	}
    }

    public static void main (String[] args) {
	A = new BankAccount("Alpha", 12345);
	B = new BankAccount("Beta", 67890);
	a = new Coin();
	b = new Coin();

	public void turn(){
	    pot = A.withdraw(Math.random() * 100) + B.withdraw(Math.random() * 100);
	    while (pot > 0) {
		A.flip();
		B.flip();
		if (a.getface() == "heads" && b.getface() == "heads") 
	    A.deposit(pot);
		    pot = 0;
		}
		else if (a.getface() == "tails" && b.getface() == "tails") {
		    B.deposit(pot);
		    pot = 0;
		}
	    }
	}
