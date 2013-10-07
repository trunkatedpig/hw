import java.io.*;
import java.util.*;

public class CoinPurse {
    private double amount;
    
    public CoinPurse() {
	amount = 0.00;
	    }

    public void addTo(Coin c) {
	amount = amount + c.getValue();
    }

    public void removeFrom(Coin c) {
	amount = amount - c.getValue();
    }
}