import java.io.*;
import java.util.*;

public class CoinPurse {
    private double amount;

    public void addTo(Coin c) {
	amount = amount + c.getValue();
    }
    public void removeFrom(Coin c) {
	if (amount > c.getValue()) {
	    amount = amount - c.getValue(); }
    }

    public CoinPurse() {
	amount = 0;
    }

    public double getAmount() {
	return amount;
    }
}