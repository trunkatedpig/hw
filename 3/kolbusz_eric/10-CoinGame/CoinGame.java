import java.io.*;
import java.util.*;
import java.math.*;

public class CoinGame {
    private Coin c1,c2;
    private BankAccount p1,p2;
    private int pot = 0;

    public CoinGame (BankAccount pl1, BankAccount pl2) {
	c1 = new Coin();
	c2 = new Coin();
	p1 = pl1;
	p2 = pl2;
    }

    public String turn() {
	int p1balance = p1.getBalance();
	int p2balance = p2.getBalance();

	if (p1balance == 0) {
	    return "Player 1 loses!";}
	else {
	    if (p2balance == 0) {
		return "Player 2 loses!";}
	    else {
		int amounttowithdraw;
		if (p1balance > p2balance) {
		    amounttowithdraw = (int)(Math.random()*p2balance) + 1;}
		else {
		    amounttowithdraw = (int)(Math.random()*p1balance) + 1;}
		//money pool is from 1-max of poorer player per player
		
		p1.withdraw(amounttowithdraw);
		p2.withdraw(amounttowithdraw);
		
		pot = pot + 2*amounttowithdraw;
		
		c1 = new Coin();
		c1.flip();
		c2 = new Coin();
		c2.flip();
		
		String c1face = c1.getFace();
		String c2face = c2.getFace();

		if (c1face.equals(c2face)) {
		    if (c1face.equals("heads")) {
			p1.deposit(pot);}
		    else {
			p2.deposit(pot);}
		    pot = 0;
		}
		return "Turn completed.";
	    }
	}
    }

    public void play(int n) {
	while (n > 0) {
	    turn();
	    n = n-1;}
    }

    public int getPot() {
	return pot;}
   
    public int getBalance(BankAccount p) {
	return p.getBalance();} 
}
