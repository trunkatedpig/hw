import java.io.*;
import java.util.*;

public class CoinPurse {
    private double amount;

    public double getAmount(){return amount;}
    
    public CoinPurse(){}
    public CoinPurse(double amt){amount=amt;}

    public void addTo(Coin c) {amount+=c.getValue();}
    public void removeFrom(Coin c) {
	if (amount>c.getValue()) {amount-=c.getValue();} 
	else {System.out.println("You don't have that much.");}
    }

    public void print() {
	System.out.println("CoinPurse amount: "+amount);
    }
}
