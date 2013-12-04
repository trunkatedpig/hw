import java.io.*;
import java.util.*;

public class CoinGame{
    private BankAccount a,b;
    private Coin c,d;
    private double pot;

    public CoinGame(BankAccount p1, BankAccount p2){
	a = p1;
	b = p2;
	c= new Coin();
	d= new Coin();
	pot = 0.0;
	a.deposit(100);
	b.deposit(100);
    }
    public void turn(){
	double b1,b2; 
	c.flip();
	d.flip();
	b1 = Math.random()*10;
	b2 = Math.random()*10;
	pot = pot + b1+ b2;
	a.withdraw(b1);
	b.withdraw(b2);
	if ((c.getFace() == "heads") && (d.getFace()== "heads")){
		a.deposit(pot);
		pot = 0.0;
	}
	else if ((c.getFace() == "tails") && (d.getFace()== "tails")){
		b.deposit(pot);
		pot = 0.0;
	}
    }
    public void play(int n){
	while (n >0){
	    turn();
	    n = n - 1;
	}
    }
    public String getWinner(){
	String i,j,k;

	i= "Player One has" + a.getBalance();
	j= "Player Two has" + b.getBalance();

	if (a.getBalance() > b.getBalance()){
	    k= "Player One has" + (a.getBalance() - b.getBalance())+ " more than Player Two";}
	else {k= "Player Two has" + (b.getBalance() - a.getBalance())+ "more than Player One";}

	return i+"\n" + j+"\n"+ k+"\n";
    }
}
