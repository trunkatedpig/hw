import java.io.*;
import java.util.*;

public class CoinPurse{
    private int amount;

    public void addTo(Coin c){
	amount = amount + c.getValue();
    }

    public void removeFrom(Coin c){
	if (amount < c.getValue()){
	    System.out.println("There is not enough money in the purse");
	}
	else {
	    amount = amount - c.getValue();
	}
    }

    public int getAmount(){
	return amount;
    }


}
