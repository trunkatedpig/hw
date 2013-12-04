import java.io.*;
import java.util.*;

public class CoinGame{
    private BankAccount P1, P2;
    private Coin C1, C2;
    private double pot;

    public CoinGame(BankAccount player1, BankAccount player2){
	P1 = player1;
	P2 = player2;
	P1.deposit(100000);
	P2.deposit(100000);
	C1 = new Coin();
	C2 = new Coin();
	pot = 0.0;
    }

    public void turn(){
	double money1, money2;
	money1 = Math.random()*P1.getBalance();
	money2 = Math.random()*P2.getBalance();

	P1.withdraw(money1);
	P2.withdraw(money2);
	pot = pot + money1 + money2;
	C1.flip();
	C2.flip();

	if((C1.getFace() == "head") && (C2.getFace() == "head")){
		P1.deposit(pot);
		pot = 0.0;
	}
	else if ((C1.getFace() == "tail") && (C2.getFace() == "tail")){
		    P2.deposit(pot);
		    pot = 0.0;
	}
	else if((C1.getFace() == "tail" || C1.getFace() == "head") && (C2.getFace() == "tail" || C2.getFace() ==  "head")){
	    pot = pot + money1 + money2;
	}
    }
	    

    public void play(int n){
	int round = 0;
	while (n > 0){
	    turn();
	    n = n - 1;
	    round = round + 1;
	}
    }

    
    public String result(){
	String message;

	message = "Player 1 won $" + P1.getBalance() + "\n";
	message = message + "Player2 won $" + P2.getBalance() + "\n";

	if (P1.getBalance() > P2.getBalance()){
	    message = message + "Player uno is winning!!" + "\n";
	}
        else if (P2.getBalance() > P1.getBalance()){
	    message = message + "Player dos is winning!!" + "\n";
	}
	else {
	    message = message + "THEY TIED" + "\n";
	}
	return message;
    }
}
