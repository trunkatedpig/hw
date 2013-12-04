import java.io.*;
import java.util.*;

public class CoinGame {
    private BankAccount p1 = new BankAccount("P1",1);
    private BankAccount p2 = new BankAccount("P2",2);
    private Coin c1 = new Coin();
    private Coin c2 = new Coin();
    private Random r;
    private double pot;

    public void setMoney() {
	p1.deposit(1000.00);
	p2.deposit(1000.00);
    }

    public void setPot() {
	double p = Math.min(p1.getBalance(),p2.getBalance()); 
	double i = Math.random();
	while (i < p) {
	    i = i * 10;
		}
	i = i/10;
	pot = i;
    }

    public void turn() {
	setPot();
	c1.flip();
	c2.flip();
	String f1 = c1.getFace();
	String f2 = c2.getFace();
	if (f1.equals("Heads") && f2.equals("Heads")) {
	    p1.takeMoneyFrom(p2,pot);
	}
	if (f1.equals("Tails") && f2.equals("Tails")) {
	    p2.takeMoneyFrom(p1,pot);
	}
    }

    public double getMoney() {
	double q =  p1.getBalance();
	q = q * 100;
	q = (int)(q);
	q = q / 100;
	return q;
    }

    public double getMoney2() {
	double w = p2.getBalance();
	w = w * 100;
	w = (int)(w);
	w = w / 100;
	return w;
    }

    public void play(int n) {
	setMoney();
	while (n > 0) {
	    turn();
	    n = n -1;
	}
    }
}
  
