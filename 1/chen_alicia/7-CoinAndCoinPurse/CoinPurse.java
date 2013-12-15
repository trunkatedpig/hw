import java.io.*;
import java.util.*;

public class CoinPurse {
    private double amount;
    private Coin coin;

    public void initCoinPurse (double amt){
	amount = amt;
    }

    public CoinPurse(){
	initCoinPurse(0.0);
    }

    public void addTo(Coin c){
	amount += c.getValue();
    }
    public void removeFrom(Coin c){
	amount -= c.getValue();
    }
    public double getAmount(){
	return amount;
    }
}
