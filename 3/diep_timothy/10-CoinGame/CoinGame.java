import java.io.*;
import java.util.*;

public class CoinGame {
    private double pot;
    private BankAccount p1,p2;
    private Coin c1,c2;

    public CoinGame() {
	p1.balance = 100.0;
	p2.balance = 100.0;
	
    public void turn() {
	if (c1.flip().equals(c2.flip()) && c1.flip().equals("heads")) {
	    p1.balance = p1.balance + pot;
	}
    }
	
    public void play(int n) {
	while (n != 0) {
	    turn();
	    n = n - 1;
	}
    }
	   
	
}