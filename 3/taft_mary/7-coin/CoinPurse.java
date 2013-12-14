import java.io.*;
import java.util.*;

public class CoinPurse {
    
    private double amount;

    public CoinPurse() {
	amount = 0.0;
    }

    public void addTo(Coin c) {
	amount = amount + c.getValue();
    }

    public void removeFrom(Coin c) {
	if (c.getValue() < amount)
	    amount = amount - c.getValue();
	else
	    amount = 0.0;
    }

    public double getAmount() {
	return amount;
    }

}
