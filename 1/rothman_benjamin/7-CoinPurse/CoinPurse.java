import java.io.*;
import java.util.*;

public class CoinPurse {

    private double amount;

    public void addTo (Coin c) {

	amount += c.getValue();

	    }

    public void removeFrom (Coin c) {

	amount -= c.getValue();

    }

    public CoinPurse (double v){
    amount = v;

}


    public double getAmount() {
	return amount;
    }

}

