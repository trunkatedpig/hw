import java.io.*;
import java.util.*;

public class CoinPurse {

    private double amount;

    public void addTo(Coin c) {
	amount += c.getValue();
    }

    public void removeFrom(Coin c) {
	amount -= c.getValue();
    }


    public String getTotal(){
	return "The total amount in the purse is " + amount;
    }
	
}

