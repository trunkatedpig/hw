import java.io.*;
import java.util.*;

public class CoinGame {
 
    // Variables:
    // private BankAccount p1,p2, pot;
    private Coin c1,c2;

   BankAccount p1 = new BankAccount(10);
   BankAccount p2 = new BankAccount(10);
   BankAccount  pot = new BankAccount(0);


    //Methods:

    public void setup(){
	double amt;
	amt = ((int)(Math.random()*100))/100;
	if (p1.getBalance() >= amt && p2.getBalance() >= amt){ 	pot.takeMoneyFrom(p1, amt);
	    pot.takeMoneyFrom(p2, amt);
	}
    }
	public void turn(){
	    setup();
	    String result1 = c1.flipCoin();
	    String result2 = c2.flipCoin();
	    if ((result1.equals("heads")) && (result2.equals("heads"))){
		p1.takeMoneyFrom(pot, pot.getBalance() );
	    }
	    else if ((result1.equals("tails")) && (result2.equals("tails"))){
		    p2.takeMoneyFrom(pot, pot.getBalance());
		}	
	}

	public double getCurrentBalance1(){
	    return p1.getBalance();
	}

	public double getCurrentBalance2(){
	    return p2.getBalance();
	}

	public void play(int n){
	    while( n > 0){
		turn();
		n = n - 1;
	}
	}


}
