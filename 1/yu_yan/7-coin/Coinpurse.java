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
	amount = c.getAmount() + getPAmount();
    }
    public void removeCoin(Coin c){
	amount = amount - c.getAmount();
    }

    public void addAmt(int a){
    }
    public void removeAmt(int a){
    }

    public double getPAmount(){
	return amount;
    }
}
