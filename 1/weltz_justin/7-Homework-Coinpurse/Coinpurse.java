import java.io.*;
import java.util.*;
//worked with Venessa
public class Coinpurse{
    private double amount;
    public Coinpurse(){
	setPurse();
    }	
    public void setPurse(){
	amount = 0;
    }
    public void setPurse(double amount){
	amount = amount;
    }

    public void addTo(Coin c){
	amount = c.getAmount() + amount;
    }
    public void removeFrom(Coin c){
	amount = amount - c.getAmount();
    }

    public double getAmount(){
	return amount;
    }
}
