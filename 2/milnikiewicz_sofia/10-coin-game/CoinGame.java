import java.io.*;
import java.util.*;

public class CoinGame {
    private Coin c1,c2;
    private BankAccount b1,b2;
    private double pot;
    
    public CoinGame(BankAccount b1, BankAccount b2, Coin c1, Coin c2) {
        this.b1 = b1;
        this.b2 = b2;
        this.c1 = c1;
        this.c2 = c2;
        pot = 0.0;
    }

    public CoinGame(BankAccount b1, BankAccount b2, Coin c1, Coin c2, double amt) {
        this.b1 = b1;
        this.b2 = b2;
        this.c1 = c1;
        this.c2 = c2;
        pot = amt;
    }

    public void turn(){
	if (b1.getBalance() <= 0){
	    System.out.println("Player 1 cannot play");
	    return;
	}
	else if (b2.getBalance() <= 0){
	    System.out.println("Player 2 cannot play");
	    return;
	}
	
	double bet;
        bet = Math.random();

        if (bet > b1.getBalance() || bet > b2.getBalance()) {
            bet = Math.min(b1.getBalance(), b2.getBalance());
        }

        b1.withdraw(bet);
        b2.withdraw(bet);
        pot = pot + (bet * 2);

        c1.flip();
        c2.flip();

        if (c1.getFace().equals(c2.getFace()) && c1.getFace().equals("Heads")) {
            b1.deposit(pot);
            pot = 0;
        }
        else if (c1.getFace().equals(c2.getFace()) && c1.getFace().equals("Tails")) {
            b2.deposit(pot);
            pot = 0;
        }
    }
	

    public double getPot() {
        return pot;
    }


    public void play(int n) {
        while (n > 0) {
            if (b1.getBalance() <= 0) {
                System.out.println("Player 1 cannot play");
                break;
            }
            else if (b2.getBalance() <= 0) {
                System.out.println("Player 2 cannot play");
                break;
            }
            else {
                turn();
                n = n - 1;
            }
        }
    }

}
