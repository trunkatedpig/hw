import java.io.*;
import java.util.*;

public class CoinGame {
    BankAccount b1 = new BankAccount(100.00);
    BankAccount b2=  new BankAccount(100.00);
    Coin c1= new Coin();
    Coin c2 = new Coin();
    BankAccount pot= new BankAccount(0);
    public void turn() {
	c1.flip();
	c2.flip();
	pot.takeMoneyFrom(b1,2.00);
	pot.takeMoneyFrom(b2,2.00);
	if (c1.getFace().equals(c2.getFace()) && c1.getFace().equals("Heads")){
	    pot.giveMoneyTo(b1,pot.getBalance());
	}
	else if (c1.getFace().equals(c2.getFace()) && c1.getFace().equals("Tails")){
	    pot.giveMoneyTo(b2,pot.getBalance());
       
	}
    }
    public void play(int n) {
	while (n>0){
	    turn();
	    n=n-1;
		}

    }
    public double getBalance1(){
	return b1.getBalance();
    }
    public double getBalance2(){
	return b2.getBalance();
    }
    public String getFace1(){
	return c1.getFace();
    }
    public String getFace2(){
	return c2.getFace();
    }
    public double getBalancePot(){
        return pot.getBalance();
    }
}
