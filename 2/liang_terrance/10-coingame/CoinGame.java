import java.io.*;
import java.util.*;

public class CoinGame{
    private BankAccount p1,p2;
    private Coin c1,c2;
    private double pot;

    public CoinGame(BankAccount player1, BankAccount player2){
	p1 = player1;
	p2 = player2;
	p1.deposit(10000);
	p2.deposit(10000);
	pot = 0;
	c1 = new Coin ();
	c2 = new Coin ();
    }

    public void turn(){
	double p1money,p2money;
	p1money = Math.random()*p1.getBalance();
	p2money = Math.random()*p2.getBalance();
	p1.withdraw(p1money);
	p2.withdraw(p2money);
	pot = pot +  p1money + p2money;
	c1.faceFlip();
	c2.faceFlip();
	if ((c1.getFace() == "Heads") && (c2.getFace() == "Heads")){
	    p1.deposit(pot);
	    pot = 0;
	}
	else if ((c1.getFace() == "Tails") && (c2.getFace() == "Tails")){
	    p2.deposit(pot);
	    pot = 0;
	}
    }	

    public void play(int n){
	int round=0;
	while (round < n){
	    turn();
	    round = round + 1;
	}
    }
   
    public String status(){
	String message;
	message = "Player 1 has: $" + p1.getBalance() + "\n";
	message = message + "Player 2 has: $" + p2.getBalance() + "\n";
	if (p1.getBalance() > p2.getBalance()){
	    message = message +  "Player 1 is winning!" + "\n";
		}
	else if (p2.getBalance() > p1.getBalance()){
	    message = message + "Player 2 is winning!" + "\n";
		}
	else {
	    message = message + "It's a draw!" + "\n";
	}
	return message;
    }



}
