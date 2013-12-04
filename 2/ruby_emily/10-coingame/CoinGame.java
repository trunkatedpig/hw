import java.io.*;
import java.util.*;

public class CoinGame{
    BankAccount p1=new BankAccount("Emily", 123, 100.00);
    BankAccount p2=new BankAccount("Aida", 456, 100.00);
  
    Coin a= new Coin();
    Coin b=new Coin();
    
    private double pot=0.00;

    public void makePot(){
	Random r= new Random();
	double r1=r.nextInt(11);
	double r2=r.nextInt(11);
        p1.withdraw(r1);
	p2.withdraw(r2);
	pot=pot+r1+r2;
    }
    public void turn(){
	a.flip();
	b.flip();
	if ((a.getFace().equals("heads"))&&(b.getFace().equals("heads"))){
	    p1.deposit(pot);
	}
	else if ((a.getFace().equals("tails"))&&(b.getFace().equals("tails"))){
	    p2.deposit(pot);
	}
    }
    
    public void play(int n){
	makePot();
	int i=n;
	while (i>0){
	    turn();
	    i=i-1;
	}
	
    }
    
    public String getBalances(){
	String winner=new String();
	if (p1.getBalance()>p2.getBalance()){
	    winner="p1";
	}
	else {
	    winner="p2";
	}
	    return "p1 has "+String.valueOf(p1.getBalance())+"\np2 has "+String.valueOf(p2.getBalance())+"\n" +winner+"is the winner";

    }
    public double getPot(){
	return pot;
	}
	  
}
