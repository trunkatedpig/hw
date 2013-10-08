import java.io.*;
import java.util.*;

public class CoinPurse {
    private double amount;
    
    public CoinPurse(){
	amount = 0.0;
    }
    
    public double getAmount(){
	return amount;
    }
    
    public void addTo(Coin c){
	amount = amount + c.getValue();
    }

    public void removeFrom(Coin c){
	amount = amount - c.getValue();
    }

}
