import java.io.*;
import java.util.*;

public class CoinPurse {
    private int amount;
    public void CoinPurse() {
	amount=0;
    }
    public void addTo(Coin c) {
	amount=amount+c.getVal();
    }
    public void removeFrom(Coin c) {
	amount= amount-c.getVal();
    }
    public int getAmount() {
	return amount;
    }
}
