import java.io.*;
import java.util.*;

public class CoinPurse {

    public double amount;

    public void addTo (Coin c) {
	amount = amount + c.amount;
    }
    
    public void removeFrom (Coin c) {
	amount = amount - c.amount;
    }

}
