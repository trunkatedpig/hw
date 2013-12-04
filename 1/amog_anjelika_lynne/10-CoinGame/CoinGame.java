import java.io.*;
import java.util.*;

public class CoinGame{
    private BankAccount player1, player2;
    private Coin c1, c2;
    private double pot;
    private int p1wins, p2wins;

    public CoinGame(BankAccount p1, BankAccount p2){
	p1wins = 0;
	p2wins = 0;
	double amt = Math.random();
	pot = amt * 2;
	player1 = p1;
	player2 = p2;
	player1.withdraw(amt);
	player2.withdraw(amt);
    }

    public void turn(){
	c1 = new Coin();
	c2 = new Coin();
	String face1, face2;
	face1 = c1.flip();
	face2 = c2.flip();
	if (face1.equals(face2)){
	    if (face1 == "Heads"){
		player1.deposit(pot);
		pot = 0;
		p1wins = p1wins + 1;
	    }
	    else{
		player2.deposit(pot);
		pot = 0;
		p2wins = p2wins + 1;
	    }
	}
	else {
	    pot = pot;
	}
    }
    
    public void play(int n){
	int t = n;
	while (t > 0) {
	    turn();
	    t = t - 1;
	}
    }

    public double getPot(){
	//name sounds strange but okay
	return pot;
    }

    public int getp1Wins(){
	return p1wins;
    }
    
    public int getp2Wins(){
	return p2wins;
    }
}