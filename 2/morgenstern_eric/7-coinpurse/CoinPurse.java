import java.io.*;
import java.util.*;

public class CoinPurse {
    public double amount;
    private int accountnumber;
    public CoinPurse(int acctnum, double amt){
	amount = amt;
	accountnumber = acctnum;
    }
    public void addTo(Coin c){
	if ((c.name == "quarter") || (c.name == "Quarter")){
		amount = amount + .25;
	    }
	else if ((c.name == "dime") || (c.name == "Dime")){
		amount = amount + .10;
	    }
	else if ((c.name == "nickel") || (c.name == "Nickel")){
		amount = amount + .05;
	    }
	else{
	    amount = amount + .01;
	}
    }

     public void removeFrom(Coin c){
	 if ((c.name == "quarter") || (c.name == "Quarter")){
		amount = amount - .25;
	 }
	 else if ((c.name == "dime") || (c.name == "Dime")){
		amount = amount - .10;
	 }
	 else if ((c.name == "nickel") || (c.name == "Nickel")){
		amount = amount - .05;
	 }
	 else{
	    amount = amount - .01;
	 }
    }
}
