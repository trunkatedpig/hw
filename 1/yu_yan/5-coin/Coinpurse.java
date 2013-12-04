import java.io.*;
import java.util.*;

public class Coinpurse{
    private double amount;
    
    public void setPurse(){
	amount = 0;
    }
    public void setPurse(double amount){
	amount = amount;
    }

    public void addCoin(Coin c){
	amount = c.getAmount() + amount;
    }
    public void removeCoin(Coin c){
	amount = amount - c.getAmount();
    }

    public double getAmount(){
	return amount;
    }
}