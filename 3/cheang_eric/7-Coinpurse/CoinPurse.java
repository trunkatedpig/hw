import java.io.*;
import java.util.*;

public class CoinPurse{
    
    int amount;
    String isMagic;
    
    
    public CoinPurse(String isMagic){
	if (isMagic.equals("Yes")) {
	    isMagic      = "Yes";
		    }}
    
    public void  addTo(Coin coin, int value){
	if (isMagic.equals("Yes")){
	    amount = amount + value;
	}
	else if (coin.equals("Penny")){
		amount = amount + 1;
	    } 
	    else if (coin.equals("Dime")){
		amount = amount + 10;
	    } 
	    else if (coin.equals("Nickel")){
		    amount = amount + 5;
	    }
	    else if (coin.equals("Quarter")){
		amount = amount + 25;
	    }
	    else {
		System.out.println("Unrecognized Coin. The following are allowed coins");
		System.out.println("Quarter");
		System.out.println("Dime");
		System.out.println("Nickel");
		System.out.println("Penny");
	    }}



	    
    public void removeFrom(Coin coin, int value){
	if (isMagic.equals("Yes")) {
	    amount = amount - value;
	}
	else    if (coin.equals("Penny")){
		amount = amount - 1;
	    } 
	    else if (coin.equals("Dime")){
		amount = amount - 10;
	    } 
	    else if (coin.equals("Nickel")){
		    amount = amount - 5;
	    }
	    else if (coin.equals("Quarter")){
		amount = amount - 25;
	    }
	    else {
		System.out.println("Unrecognized Coin. The following are allowed coins");
		System.out.println("Quarter");
		System.out.println("Dime");
		System.out.println("Nickel");
		System.out.println("Penny");
	    }}
    
    public int getamount(){
        return amount;
    }}

   
			    
					       

		    
			
		
		    
    
    
	
	    
    
    
    
    
    
    
    

    
