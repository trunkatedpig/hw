import java.io.*;
import java.util.*;

public class CoinPurse{
    //Variables
    private double amount;
    private int numCoins;

    //Constructors
    public CoinPurse(){
	amount = 0;
	numCoins = 0;
    }

    //Methods
    public void addTo(Coin c){
	amount = amount + c.getValue();
	numCoins = numCoins + 1;    
    }

    public void removeFrom(Coin c){
	amount = amount - c.getValue();
	numCoins = numCoins -1;
    }

    public double getAmount(){
	return amount;
    }
}
