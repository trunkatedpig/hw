import java.util.*;
import java.io.*;

public class CoinGame {
    private BankAccount player1, player2;
    private Coin coin1, coin2;
    private double pot;


    public double setPot() {
	double max = 0;
	if (player1.getBalance > player2.getBalance)
	    max = max + player2.getBalance;
	else
	    max = max + player1.java;

	Random r = new Random();
	pot = 2 * r.nextInt(1, max);
    }
}