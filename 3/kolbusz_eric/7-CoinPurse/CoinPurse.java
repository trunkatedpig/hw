import java.io.*;
import java.util.*;

public class CoinPurse {
    private int amount = 0;
    
    public CoinPurse(int a) {
	amount = a;
    }

    public void addTo(Coin c) {
	amount = amount + c.getValue();
    }

    public void removeFrom(Coin c) {
	int v;
	v = c.getValue();
	if (amount >= v) {
	    amount = amount - v;}
	else { System.out.println("Not enough money.");
		}
    }

    public int getAmount() {
	return amount;
    }
}
