import java.io.*;
import java.util.*;

public class CoinGame{
    private double pot;
    private BankAccount player1, player2;
    private double balance1, balance2;
    private Coin coin1, coin2;

    public CoinGame(BankAccount b1, BankAccount b2){
	player1 = b1;
	balance1 = player1.getBalance();
	player2 = b2;
	balance2 = player2.getBalance();
	coin1 = new Coin();
	coin2 = new Coin();
	pot = 0;
    }
    
    public void setPot() {
	Random r = new Random();
	int b1 = (int)(balance1);
	int b2 = (int)(balance2);
	int a1 = r.nextInt(b1);
	int a2 = r.nextInt(b2);
	double amount1 = (double)(a1);
	double amount2 = (double)(a2);

	player1.withdraw(amount1);
	player2.withdraw(amount2);

	pot = pot + amount1 + amount2;
    }

    public void turn(){
	String face1 = coin1.flip();
	String face2 = coin2.flip();
	if ((face1.equals("heads")) && (face2.equals("heads"))){
	    player1.deposit(pot);
	    pot = 0;
	}
	if ((face1.equals("tails")) && (face2.equals("tails"))){
	    player2.deposit(pot);
	    pot = 0;
	}
    }

    public void play(int n){
	while (n > 0){
	    turn();
	    n = n - 1;
	}
    }
    
}
