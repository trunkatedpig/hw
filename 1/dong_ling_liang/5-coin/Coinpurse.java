import java.io.*;
import java.util.*;

public class coinpurse{

    private double amount;
    
    public coinpurse(){
    	amount = 0
    }
    
    public void addTo (Coin c) {
	amount = amount + c.getAmount;
    }
    
    public void removeFrom (Coin c) {
	amount = amount - c.getAmount;
    }
    public double purseValue(){
    	return amount;
    }
}
