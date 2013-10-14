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
	//set the max value for what can be withdrawn from each BankAccount
	int max = 0;
	int p1Balance = (int)(player1.getBalance());
	int p2Balance = (int)(player2.getBalance());
	if (p1Balance > p2Balance)
	    max = max + p2Balance;
	else
	    max = max + p1Balance;

	//actually create a random amount to withdraw from each BankAccount
	Random r = new Random();
	pot = r.nextInt(max);

	player1.withdraw(pot);
	player2.withdraw(pot);
	
	//the actual pot
	pot = 2 * pot;
    }
    
    public void flipCoins() {
	c1face = coin1.flip();
	c2face = coin2.flip();

	//if there are 2 heads p1 wins, if there are 2 tails p2 wins, if its one of each no one wins
	if (c1face.equals(c2face)) {
	    if (c1face.equals("Heads"))
		player1.deposit(pot);
	    else
		player2.deposit(pot);
	    pot = 0;
	}	
    }

    public double getP1Worth() {
	return player1.getBalance();
    }


    public double getP2Worth() {
	return player2.getBalance();
    }

    public void turn() {
	//this checks if someone won last round, if they did, the pot is reset, if not, the pot stays the same
	if (pot == 0)
	    setPot();
	flipCoins();
	System.out.println(player1.getName() + " has: " + getP1Worth());
	System.out.println(player2.getName() + " has: " + getP2Worth());
	System.out.println();
    }

    public void play(int n) {
	System.out.println();
	System.out.println("The starting worth of " + player1.getName()  + " is " + getP1Worth());
	System.out.println("The starting worth of " + player2.getName()  + " is " + getP2Worth());
	System.out.println();

	//plays for n number of turns unless someone's worth becomes 0
	int turn = 1;
	while (n > 0) {
	    if (getP1Worth() == 0 || getP2Worth() == 0)
		break;
	    System.out.println("Turn " + turn);
	    turn();
	    n = n - 1;
	    turn = turn + 1;
	}
    }
}
