import java.io.*;
import java.util.*;

public class Coinpurse{

    private double amount;
    
    public Coinpurse(){
    	amount = 0
    }
    
    public void addTo (Coin c) {
	amount = Double.valueOf((amount.doubleValue()) + ((c.getAmount).doubleValue()))
    }
    
    public void removeFrom (Coin c) {
	amount = Double.valueOf((amount.doubleValue()) - ((c.getAmount).doubleValue()))
    }
    public double purseValue(){
    	return amount;
    }
}
