import java.io.*;
import java.util.*;

public class CoinPurse{ 
    private int amount=0;
    private int numCoins=0;   

    public void addCoin(Coin c){
	amount = amount + c.getWorth();
	numCoins = numCoins + 1;
    }
    public void removeCoin(Coin c){
	amount = amount - c.getWorth();
	numCoins = numCoins - 1;
    }
    public int getAmount(){
	return amount;
    }
    public int getNumCoins(){
	return numCoins;
    }

    public String getInfo(){
	return "\nAmount = " + Integer.toString(amount) + "\nnumCoins = " + Integer.toString(numCoins);
    }
}
