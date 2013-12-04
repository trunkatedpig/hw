import java.io.*;
import java.util.*;

public class CoinGame{
    private BankAccount b1;
    private BankAccount b2;
    private Coin c1;
    private Coin c2;
    private double pot;
    
    public CoinGame(BankAccount p1, BankAccount p2){
	b1 = p1;
	b2 = p2;
        c1 = new Coin();
	c2 = new Coin();
	b1.deposit(1000);
	b2.deposit(1000);
	pot = 0;
    }
    
    public String getScores(){
	return "player 1 : " + String.valueOf( b1.getBalance()) +  " player 2 : "+ String.valueOf(b2.getBalance());
    }
 

    public void turn(){
	c1.flip();
	c2.flip();
	pot = pot + (Math.random())*10;
        b1.withdraw(pot/2);
	b2.withdraw(pot/2);
	if ((c1.getFace() == "Heads") && (c2.getFace() == "Heads")){
	    b1.deposit(pot);
	    pot = 1;
	}
	else if(c1.getFace() == "Tails" && c2.getFace() == "Tails"){
	    b2.deposit(pot);
	    pot = 0;
	}
    }
    public void play(int n){
	while (n > 0){
	turn();
	n = n -1;
    }
    }
}

    
    
