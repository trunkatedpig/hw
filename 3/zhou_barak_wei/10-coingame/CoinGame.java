import java.io.*;
import java.util.*;

public class CoinGame {
    private int pot = 0;
    private int ante = 0;
    private BankAccount p1;
    private BankAccount p2;
    private Coin c1;
    private Coin c2
    
	public CoinGame(int newpot, int newante, BankAccount a, BankAccount b, Coin newcoin, Coin newcoin2) {
	pot = newpot;
	ante = newante;
	p1 = a;
	p2 = b;
	c1 = newcoin;
	c2 = newcoin2;
    }

    public void turn() {
	if (ante <= p1.getBalance() && ante <= p2.getBalance()) {
	    pot = pot + (2 * ante);
	    p1.withdraw(ante);
	    p2.withdraw(ante);
	}
	
    }
}