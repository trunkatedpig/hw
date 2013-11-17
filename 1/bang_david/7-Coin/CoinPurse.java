import java.util.*;
import java.io.*;

public class CoinPurse {
    private double amount;

    public CoinPurse (double a){
    /* inserting starting value for Coinpurse */
	setAmount (a);
    }
    
    public void setAmount (double c) {
	amount = c;
    }
    public double getAmount () {
	return amount;
    }

    public void addTo (Coin c) {
	setAmount ( amount + c.getAmount());
    }

    public void removeFromTo (Coin c) {
	setAmount (amount -  c.getAmount());
    }    
}
 
