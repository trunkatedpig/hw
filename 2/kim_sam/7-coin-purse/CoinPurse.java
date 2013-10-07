import java.io.*;
import java.util.*;

public class CoinPurse {

    private int amount;
    private Coin coin;

    public void addTo(Coin c1) {
	amount += c1.getValue();
    }

    public void removeFrom(Coin c1) {
	amount -= c1.getValue();
    }


    public String getTotal(){
	return "The total amount in the purse is " + amount;
    }
	
}

