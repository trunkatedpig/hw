import java.io.*;
import java.util.*;

public class CoinGame {

    private double pot;
    private BankAccount p1, p2;
    private Coin c1, c2;
    private int count;

    public void turn() {
	r = new Random();
	double pot = r.nextDouble(100.0);
	p1.withdraw(pot);
	p2.withdraw(pot);
	
	c1.flip();
	c2.flip();
	
	if (c1.equals(c2) && c1.getFace().equals("Heads")) {
	    p1.deposit(pot*2);
	    count = count + 1;
	    System.out.println("Player 1 : " + p1.getBalance() + " Player 2: " + p2.getBalance());
	} else if (c1.equals(c2)) {
	    p2.deposit(pot*2);
	    count = count + 1;
	    System.out.println("Player 1 : " + p1.getBalance() + " Player 2: " + p2.getBalance());
	} else {
	    p1.deposit(pot);
	    p2.deposit(pot);
	    count = count + 1;
	    System.out.println("Player 1 : " + p1.getBalance() + " Player 2: " + p2.getBalance());
	}
    }

    public void play(int n) {
	while (n > 0) {
	    n = n - 1;
	    turn();
	    System.out.println("Turn " + count);
	}
    }


    public static void main(String[] args) {
	play (3);



    }





}