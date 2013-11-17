import java.io.*;
import java.util.*;

public class CoinPurse {

    private double amount;

    public CoinPurse(double amt) {
    amount = amt;
}

    public void addTo(Coin c) {
	amount = amount + c.getAmount();
    }
    public void removeFrom(Coin c) {
	amount = amount - c.getAmount();
    }
}