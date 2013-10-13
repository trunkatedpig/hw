import java.io.*;
import java.util.*;

public class CoinGame{
	private BankAccount BA1=new BankAccount("Player1", 123);
	private BankAccount BA2=new BankAccount("Player2", 456);
	private Coin coin1=new Coin();
	private Coin coin2=new Coin();
	private double pot=0.0;
	
	public void setPot(){
		//must find smaller account so you don't withdraw more money than one account has
		double smaller=BA1.getBalance();
		if (BA1.getBalance()>BA2.getBalance()){
			smaller=BA2.getBalance();
		}
		
		double bet=Math.random()*smaller; //puts down a random amount for the bet
		
		pot=pot+(bet*2);
		
		BA1.withdraw(bet);
		BA2.withdraw(bet);
		
	}
	
	public void turn(){
		//flip the two coins
		coin1.flip();
		coin2.flip();
		//find if two coins are equal to each other
		if (coin1.getFace()==coin2.getFace()){
			//find if they're heads or tails
			if (coin1.getFace()=="Heads"){
				//heads, so give pot to player1
				BA1.deposit(pot);
				pot=0.0;
			}
				//tails: give pot to player2
			else{
				BA2.deposit(pot);
				pot=0.0;
			}
		}
		//it's a draw! No one gets anything!
		else{
			pot=pot;
		}
	}
	public void play(int n){
		int count=1;
		while (n>0){
			System.out.println("Turn "+count+":");
			turn();
			n=n-1;
			count=count+1;
		}
	}
}