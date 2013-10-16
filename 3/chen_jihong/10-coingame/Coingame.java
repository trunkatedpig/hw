import java.io.*;
import java.util.*;

public class Coingame {
    
    private Coin a,b;
    private BankAccount A,B;
    private double pot;
    
    public void turn(){
	double x = Math.random() * 100;
	double y = Math.random() * 100;
	pot = x + y;
	A = new BankAccount("Alpha",12345.0);
	B = new BankAccount("Beta",67890.0);
	a = new Coin();
	b = new Coin();
	A.withdraw (x);
	B.withdraw (y);
	while (pot > 0) {
	    a.flip();
	    b.flip();
	    if (a.getFace() == "heads" && b.getFace() == "heads") {
		A.deposit(pot);
		pot = 0;
	    }
	    else if (a.getFace() == "tails" && b.getFace() == "tails") {
		B.deposit(pot);
		pot = 0;
	    }
	    System.out.println(a.getFace());
	    System.out.println(b.getFace());
	}
    }

    public void play(int n) {
	int a = 0;
	while (a < n) {
	    turn();
	    a = a + 1;
	    System.out.println(A.getBalance());
	    System.out.println("this is a");
	    System.out.println(B.getBalance());
	    System.out.println("This is b");
	    System.out.println(pot);
	}
    }
}

	
