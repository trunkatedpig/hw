import java.io.*;
import java.util.*;

public class CoinGame{
	private BankAccount BA1=new BankAccount("Player1", 123);
	private BankAccount BA2=new BankAccount("Player2", 456);
	//one coin=heads, other is tails
	private Coin coin1=new Coin();
	private Coin coin2=new Coin("Tails");
	private double pot=0.0;
	
	public void setStuff(){
		BA1.deposit(1000);
		BA2.deposit(1000);
	}
	
	public void setPot(){	
		System.out.println("Before flipping, Player1 has $"+BA1.getBalance());
		System.out.println("Before flipping, Player2 has $"+BA2.getBalance());
	
		//must find smaller account so you don't withdraw more money than one account has
		double smaller=BA1.getBalance();
		if (BA1.getBalance()>BA2.getBalance()){
			smaller=BA2.getBalance();
		}
		
		double bet=(int )(Math.random()*smaller*100 + 1); //puts down a random amount for the bet that's to the nearest 100th
		bet=bet/100;
		
		System.out.println("The bet is $"+bet);
		
		pot=pot+(bet*2);
		
		System.out.println("The pot is now worth $"+pot);
		
		BA1.withdraw(bet);
		BA2.withdraw(bet);
		
		System.out.println("Player1 now has $"+BA1.getBalance()+" after the bet");
		System.out.println("Player2 now has $"+BA2.getBalance()+" after the bet");
		
	}
	
	public void turn(){
		setPot();
	
		//flip the two coins
		coin1.flip();
		coin2.flip();
		
		System.out.println("Coin1 is flipped and the result is..."+coin1.getFace()+"!");
		System.out.println("Coin2 is flipped and the result is..."+coin2.getFace()+"!");

		//find if two coins are equal to each other
		if (coin1.getFace()==coin2.getFace()){
			//find if they're heads or tails
			if (coin1.getFace()=="Heads"){
				//heads, so give pot to player1
				BA1.deposit(pot);
				pot=0.0;
				System.out.println("Both coins are heads! Player1 wins the pot and now has $" + BA1.getBalance());
				System.out.println("Sorry Player2, you lost this time! You now have $"+BA2.getBalance());
			}
				//tails: give pot to player2
			else{
				BA2.deposit(pot);
				pot=0.0;
				System.out.println("Both coins are tails! Player2 wins the pot and now has $" + BA2.getBalance());
				System.out.println("Sorry Player1, you lost this time! You now have $"+BA1.getBalance());
			}
		}
		//it's a draw! No one gets anything!
		else{
			pot=pot;
			System.out.println("It's a tie! No one wins the pot!");
		}
	}
	public void play(int n){
		setStuff();
		int count=1;
		while (n>0){
			System.out.println("Turn "+count+":");
			turn();
			System.out.println("");
			n=n-1;
			count=count+1;
		}
	}
}