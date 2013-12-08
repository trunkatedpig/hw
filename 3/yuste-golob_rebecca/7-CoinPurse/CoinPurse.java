import java.io.*;
import java.util.*;

public class CoinPurse{
    //instance variables
    private double amount=0;

    //methods
    public void addTo(Coin c){
	amount = amount + c.getValue();
    }
    public void removerFrom(Coin c){
	if (c.getValue() < amount){
	    amount = amount - c.getValue();
	}else{
	    System.out.println("You are too broke to complete this action");
	}
    }

    //get methods
    public double getAmount(){
	return amount;
    }
}
   
