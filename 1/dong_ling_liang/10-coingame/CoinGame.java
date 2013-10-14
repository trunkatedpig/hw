import java.util.*;
import java.io.*;

public class CoinGame {
    
    private Coin one = new Coin(1);
    private Coin two = new Coin(1);
    private BankAccount acc1 = new BankAccount("wan", 1);
    private BankAccount acc2 = new BankAccount("tew", 1);
    private BankAccount pot = new BankAccount("pot", 1997);
    private int take = (int)(Math.random()*10);

    public void setup(){
	acc1.deposit(100);
	acc2.deposit(100);
    }

    public void turn(){
	one.flip();
	two.flip();
	pot.takeMoneyFrom(acc1, take);
	pot.takeMoneyFrom(acc2, take);
	String f1 = one.getFace();
	String f2 = two.getFace();
	if (f1 == "heads" && f2 == "heads"){
	    acc1.takeMoneyFrom(pot, (pot.getBalance()));
	}
	else if (f1 == "tails" && f2 == "tails"){
	    acc2.takeMoneyFrom(pot, (pot.getBalance()));
	}
    }
    public void play(int n){
	while (n!=0){
	    turn();
	    n = n -1;
	}
    }
    public String winning(){
	if (acc1.getBalance()>acc2.getBalance()){
	    return "Player one is currently winning.";
	}
	else if (acc1.getBalance()==acc2.getBalance()){
	    return "There is a tie currently...";
	}
	else {
	    return "Player two is currently winning.";
		}
    }

}