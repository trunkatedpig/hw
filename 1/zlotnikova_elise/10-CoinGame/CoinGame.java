import java.io.*;
import java.util.*;

public class CoinGame {
    private CoinPurse BankAccount1,BankAccount2;
    private Coin c1,c2;
    c1 = new Coin("Quarter",0.25);
    c2 = new Coin("Quarter",0.25);
    BankAccount1 = new CoinPurse();
    BankAccount2 = new CoinPurse();
    private double pot;
    
    public void withdraw(double d){ 
	if (d<=pot) 
	    pot = pot - d;

    public void createPot() {
	double r = Math.random();
	
	




