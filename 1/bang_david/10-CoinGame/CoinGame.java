import java.util.*;
import java.io.*;

public class CoinGame {
    private double pot;
    
    private Coin c1 = new Coin ();
    private Coin c2 = new Coin ();

    private BankAccount p1 = new BankAccount ("Player 1" , 1);
    private BankAccount p2 = new BankAccount ("Player 2", 2);
 
    public void setBankbalance (){
    
	p1.deposit (10000);
	p2.deposit (10000);
    }

    public void addPot () {
	/* p is the amount that will be taken from each account */
	double  p = Math.random () * 100;
	pot = pot + p + p;
	p1.withdraw (p);
	p2.withdraw (p);
    }
    public double getPot (){
	return pot;
    }

    public void Flip (){
	c2.flip ();
	c1.flip ();
        
	if (c1.equal (c2)){
	    if (c1.getFace().equals ("heads")) {
			p1.deposit (pot);
			pot = 0.0;
		    }
	
		else {
			p2.deposit (pot);
			pot = 0.0;
		    }	
	    }
    }	    

    public String getCoinFace () {
	return "Coin 1 is " + c1.getFace() + ". Coin 2 is " + c2.getFace ();
    } 

    public void turn () {
	addPot ();
	Flip ();
    }

    public String  getBankAccount (){
	return "Account 1 has a balance of " + p1.getBalance () + " . Account 2 has a balance of " + p2.getBalance ();
    }
    
    public void play (int n ) {
	while ( n > 1) {
	    turn ();
	    n = n - 1;
	}
    }
}
	    
	    
	
    
  
	
