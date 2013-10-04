import java.io.*;
import java.util.*;

public class CoinPurse {
    private double amount;
    
    public void addTo(Coin c) {
	amount+=c.getValue();
    }
    public void removeFrom(Coin c) {
	if (amount>c.getValue()) {
	    amount-=c.getValue();
	} else {
	    System.out.println("You don't have that much.");
	}
    }

}