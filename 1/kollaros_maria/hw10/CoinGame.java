import java.io.*;
import java.util.*;

public class CoinGame{
    Coin one = new Coin();
    Coin two = new Coin();
    BankAccount Player1 = new BankAccount("Player1",100,1000);
    BankAccount Player2 = new BankAccount("Player2",200,1000);
    BankAccount pot = new BankAccount("pot",300,0);
    private double amount;
   
    public void turn(){
	amount = (Math.random() * 100);
	Player1.withdraw(amount);
	Player2.withdraw(amount);
	pot.deposit((amount * 2));

	one.flip();
	two.flip();

	if (one.equals(two))
	    if (one.getFace() == "Heads")
		Player1.takeMoneyFrom(pot,(pot.getBalance()));
        else 
	    Player2.takeMoneyFrom(pot,(pot.getBalance()));
    }

    public double getPlayer1(){
	return Player1.getBalance();
    }

    public double getPlayer2(){
	return Player2.getBalance();
    }

    public double getPot(){
	return pot.getBalance();
    }
  
    public void play(int n){
        int t = 0;
	while ( t < n ){
	    turn();
	    t = t + 1;

	}
    }

}				  

