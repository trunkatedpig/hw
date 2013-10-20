import java.io.*;
import java.util.*;

<<<<<<< HEAD
public class coinpurse{

    private double money;
    
    public void addTo (Coin c) {
	money += c.getAmount;
    }
    
    public void removeFrom (Coin c) {
	money -= c.getAmount;
}
=======
public class Coinpurse{

    private double amount;
    
    public Coinpurse(){
    	amount = 0;
    }
    
    public void addTo (Coin c) {
	amount = amount + c.getAmount();
    }
    
    public void removeFrom (Coin c) {
	amount = amount - c.getAmount();
    }
    public double purseValue(){
    	return amount;
    }
}
>>>>>>> c47fd85517fd0dd2c290ce6c0e958fb971aab589
