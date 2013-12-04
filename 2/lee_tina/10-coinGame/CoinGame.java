//Kelly Chen and Tina Lee
import java.io.*;
import java.util.*;

public class CoinGame {
 
    // Variables:
    // private BankAccount p1,p2, pot;
    // private Coin c1,c2;

    BankAccount p1 = new BankAccount(10);
    BankAccount p2 = new BankAccount(10);
    BankAccount pot = new BankAccount(0);
    Coin c1 = new Coin();
    Coin c2 = new Coin();


    //Methods:

    public void setup(){
	double amt;
	amt = (int)(Math.random()*100);
	amt = amt / 100;
	//System.out.println(amt);
	if (p1.getBalance() >= amt && p2.getBalance() >= amt){ 
	    pot.takeMoneyFrom(p1, amt);
	    pot.takeMoneyFrom(p2, amt);
	}
    }

    public void turn(){
	setup();
	String result1 = c1.flipCoin();
	String result2 = c2.flipCoin();
      	//System.out.println(result1);
	//System.out.println(result2);
	//System.out.println(pot.getBalance());
	if ((result1.equals("heads")) && (result2.equals("heads"))){
	    p1.takeMoneyFrom(pot, pot.getBalance() );
	}
	else if ((result1.equals("tails")) && (result2.equals("tails"))){
	    p2.takeMoneyFrom(pot, pot.getBalance());
	}	
    }
    //sometimes is large floating point?

    public double getCurrentBalance1(){
	return p1.getBalance();
    }

    public double getCurrentBalance2(){
	return p2.getBalance();
    }

    public double getPot(){
	return pot.getBalance();
    }

    public void cleanUpHelp(BankAccount p){
	double pOrig = p.getBalance();
	double pFixed = Math.round(pOrig*100)/((double)100);
	if (pOrig > pFixed){
	    p.withdraw(pOrig - pFixed);
	}
	else if (pOrig < pFixed){
	    p.deposit(pFixed - pOrig);
	}
    }
    public void cleanUp(){
	cleanUpHelp(p1);
	cleanUpHelp(p2);
	cleanUpHelp(pot);
    }

    public void play(int n){
	while( n > 0){
	    cleanUp();
	    turn();
	    n = n - 1;
	}
    }


}
