import java.io.*;
import java.util.*;

public class CoinPurse{
    private double amount;
    private int coins;


    public void addTo(Coin c){
	coins = coins + 1;
	amount = amount + c.getValue();
    }

    public void removeFrom(Coin c){
	amount = amount - c.getValue();
	coins = coins - 1;
    }
    
    public double getAmount() {
	return amount;
    }
}