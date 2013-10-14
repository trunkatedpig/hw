import java.io.*;
import java.util.*;

public class CoinGame {
    private Coin p1Coin = new Coin(), p2Coin = new Coin();
    private BankAccount p1Account = new BankAccount("Player 1", 1234), p2Account = new BankAccount("Player 2", 5678);
    private double pot;
    private int numTurns, startAmt, maxBet;
    private Random r = new Random();
    private String winner = "";

    public CoinGame(int startAmt, int maxBet) {
        this.startAmt = startAmt;
        this.maxBet = maxBet;
    }
    
    public void play(int n) {
        numTurns = 0;
        pot = 0.0;
        p1Account.deposit(startAmt);
        p2Account.deposit(startAmt);
        while (numTurns < n && winner.equals("")) {
            turn();
            numTurns = numTurns + 1;
            System.out.println(checkScore());
        }
        displayWinner();
        System.out.println("\n" + winner + " wins");
    }
    public void turn() {
        addToPot();
    	p1Coin.flip();
    	p2Coin.flip();
    	if (p1Coin.getFace().equals(p2Coin.getFace())) {
            if (p1Coin.getFace().equals("heads")) {
                p1Account.deposit(pot);
                pot = 0.0;
            }
            else {
                p2Account.deposit(pot);
                pot = 0.0;
            }
        }
    }
    public void addToPot() {
        int amt = r.nextInt(maxBet);
        //current balances
        double p1Balance = p1Account.getBalance(), p2Balance = p2Account.getBalance();
        //checks if both players have enough to bet
        if (p1Balance != 0 && p2Balance != 0) {
           p1Account.withdraw(amt);
           p2Account.withdraw(amt);
           pot = pot + (p1Balance - p1Account.getBalance()) + (p2Balance - p2Account.getBalance());
        }
        //if not, the one with money remaining wins
        else {
            displayWinner();
        }
    }
    public String checkScore(){
        double p1 = p1Account.getBalance();
        double p2 = p2Account.getBalance();
        String winning = "";
        if (p1 > p2) {
            winning = "Player 1";
        }
        else if (p2 > p1) {
            winning = "Player 2";
        }
        else {
            winning = "Neither player";
        }
        return "\nTurn " + numTurns + "\nPlayer 1 has $" + p1 + "\nPlayer 2 has $" + p2 + "\n" + winning + " is winning";
    }

    public void displayWinner() {
        if (p1Account.getBalance() > p2Account.getBalance()) {
            p1Account.deposit(pot);
            winner = "Player 1";
            pot = 0;
        }
        else if (p1Account.getBalance() < p2Account.getBalance()){
            p2Account.deposit(pot);
            winner = "Player 2";
            pot = 0;
        }
        else {
            winner = "Neither player";
        }
    }
}