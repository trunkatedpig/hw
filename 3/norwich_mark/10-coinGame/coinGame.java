import java.io.*;
import java.util.*;

public class CoinGame {
    private BankAcount B1, B2;
    private Coin C1, C2;
    private double pot; 

//random comment

    public double setPot(){
	double x = 0; 
	if (B1.getBalance > B2.getBalance)
	    x = x + B1.getBalance;
	else 
	    x = x + B2.getBalance; 

	Random r = new Random(); 
	double pot = 2 * r.nextInt(1, x);
    }
    public String getFace(){
	Coin C1 = C1.flip();
	Coin C2 = C2.flip();
    }

    public String turn(){
	if (C1.equals("heads") && C2.equals( "heads"))
	    B1.balance = B1.balance + pot; 
	else if (C1.equals("tails") && C2.equals("tails"))
	    B2.balance = B1.balance + pot;
	else 
	    return null;
    }
    

    public int getCurrent(){
	return B1.getBalance();
	return B2.getBalance();
    }

    public void play(int n){
	int result;
	result = 0;
	while (n>0){
	    result = result + CoinGame.turn();
	    n = n - 1;
	}
	return result;
	}
}
       
       
	
	
