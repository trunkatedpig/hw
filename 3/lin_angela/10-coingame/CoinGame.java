import java.util.*;
import java.io.*;



public class CoinGame {

    int pot;
    Coin c1;
    Coin c2;
    BankAccount player1;
    BankAccount player2;


    public CoinGame(){
	player1= new BankAccount(100);
	player2= new BankAccount(100);
	c1 = new Coin();
	c2 = new Coin();
	pot = 0;
    }

    public int player1Balance(){
	return player1.getBalance();
    }

    public int player2Balance(){
	return player2.getBalance();
    }

    public void turn(){
	Random r = new Random();
	double rannum = r.nextDouble();
	int bet = (int)(rannum*10+1);
	if (player1.getBalance()<bet || player2.getBalance()<bet) {
	    System.out.println("A player is out of money!");
	} else if (player1.getBalance()>=bet && player2.getBalance()>=bet){
	    player1.withdraw(bet);
	    player2.withdraw(bet);
	    pot = pot + 2*bet;
	    if (c1.coinFlip().equals("H") && c2.coinFlip().equals("H")){
		player1.deposit(pot);
		pot =0;
	    } else if  (c1.coinFlip().equals("T") && c2.coinFlip().equals("T")){
		    player2.deposit(pot);
		    pot = 0;
		}
	}
    }

    public void play(int n){
	int played = 0;
	while (played < n){
	    turn();
	    played = played + 1;
	} 
    }

    public int getPot(){
	return pot;
    }

}
