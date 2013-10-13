import java.util.*;
import java.io.*;

public class CoinGame {
    private BankAccount player1, player2;
    private Coin coin1, coin2;
    private String c1face, c2face;
    private double pot;

    public CoinGame(BankAccount p1, BankAccount p2, Coin c1, Coin c2) {
	player1 = p1;
	player2 = p2;
	coin1 = c1;
	coin2 = c2;
    }

    public void setPot() {
	int max = 0;
	int p1Balance = (int)(player1.getBalance());
	int p2Balance = (int)(player2.getBalance());
	if (p1Balance > p2Balance)
	    max = max + p2Balance;
	else
	    max = max + p1Balance;

	Random r = new Random();
	pot = 2 * r.nextInt(max);

	player1.withdraw(pot);
	player2.withdraw(pot);
    }
    
    public void flipCoins() {
	c1face = coin1.flip();
	c2face = coin2.flip();

	if (c1face.equals(c2face)){
	    if (c1face.equals("Heads"))
		player1.deposit(pot);
	    else
		player2.deposit(pot);
	}
    }

    public double getP1Worth() {
	return player1.getBalance();
    }


    public double getP2Worth() {
	return player2.getBalance();
    }

    public void turn() {
	setPot();
	flipCoins();
	System.out.println(player1.getName() + " has: " + getP1Worth());
	System.out.println(player2.getName() + " has: " + getP2Worth());
    }

    public void play(int n) {
	System.out.println("The starting worth of " + player1.getName()  + " is " + getP1Worth());
	System.out.println("The starting worth of " + player2.getName()  + " is " + getP2Worth());
	while (n > 0) {
	    if (getP1Worth() == 0 || getP2Worth() == 0)
		break;
	    turn();
	    n = n - 1;
	}
    }
}
