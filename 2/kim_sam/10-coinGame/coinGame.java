import java.io.*;
import java.util.*;

public class coinGame {

    private Coin coin1, coin2;
    private bankAccount ba1, ba2;
    private double pot;

    public coinGame (){
	coin1 = new Coin();
	coin2 = new Coin();
	ba1 = new bankAccount();
	ba2 = new bankAccount();
    }
    
    public void putMoney(){
	ba1.deposit(10000);
	ba2.deposit(10000);
    }

    public Coin getCoin1(){
	return coin1;
    }
    public Coin getCoin2(){
	return coin2;
    }

    public bankAccount getba1(){
	return ba1;
    }
    public bankAccount getba2(){
	return ba2;
    }

    public double setPot(){
	double q = Math.random()*1000;
	ba1.withdraw(q);
	ba2.withdraw(q);
	pot = 2*q;
	return pot;
    }
    public void emptyPot(){
	pot = 0;
    }

    public double getBankAccount1(){
	return ba1.getBalance();
    }
    public double getBankAccount2(){
	return ba2.getBalance();
    }
	

    

    public void turn(){
	coin1.setProb(.5);
 	coin2.setProb(.5);
	coin1.flip();
	coin2.flip();

	if (coin1.getFace() == "heads") 
	    {
		System.out.println("Coin 1: Heads");
	    }
	
	else
	    {
		System.out.println("Coin 1: Tails");
	    }
	
	if (coin2.getFace() == "heads") 
	    {
		System.out.println("Coin 2: Heads");
	    }
	
	else
	    {
		System.out.println("Coin 2: Tails");
	    }

	System.out.println("This round's winner is ");
	if (
	    coin1.getFace().equals("heads") 
	    &&
	    coin2.getFace().equals("heads"))
	    {
		System.out.print("Player 1\n");
		ba1.deposit(setPot());
		emptyPot();
	    }
	else if (
		 coin1.getFace().equals("tails") 
		 &&
		  coin2.getFace().equals("tails"))
	    {
		System.out.print("Player 2\n");
		ba2.deposit(setPot());
		emptyPot();
	    }
	else {
	    System.out.println("No winner!");
	}
	System.out.println(getBankAccount1());
	System.out.println(getBankAccount2());
    }

    public void play(int n){
	while (n != 0){
	    System.out.println("Turn: " + n);
	    turn();
	    n = n-1;
	    System.out.println();
	}	
    }
}
