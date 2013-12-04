import java.io.*;
import java.util.*;

public class Player{
    
    String Name;
    Coin PlayerCoin;
    BankAccount WalletName;
    String CoinFace1;
    String CoinFace2;
    String CoinFace;
    int Turn;
    double BettingAmount;
    double moneyPot;
    Coin CoinParameter;
    BankAccount BankParameter;
    
    

    public Player(String PlayerParameter){
	
        Name =  PlayerParameter;
	PlayerCoin = new  Coin(25, "Penny");
	WalletName = new BankAccount("a", 1);
	moneyPot = 0;
	
    }
    
    //Names

    public String getName(){
	
	return Name;
	
    }
    
    //Coin
    
    public String getFace(){
	
	CoinFace = PlayerCoin.Flip();
	return PlayerCoin.Flip();
	
    }
    
    //Wallet
    public double getAmount(){
	
	return WalletName.getBalance();
	
    }
    
    public void setMoney(double amt){
	
	WalletName.deposit(amt);
	
    }
    
    public BankAccount getBankAccount(){
	
	return WalletName;
	
    }
    
    //Game Running________________________________
	
    public int  betValue(double amt1, double amt2){
	    
	Random PotBet;
	PotBet = new Random();
	PotBet.nextInt(50000);
	    
	if (amt1 > amt2) {
	    
	    PotBet.nextInt((int)(amt1));
	    return  PotBet.nextInt((int)(amt1));
		
	}
	    
	else {
		
	    PotBet.nextInt((int)(amt2));
	    return  PotBet.nextInt((int)((amt2)));

	}}
    
    
    public void GameMatch(Player player1, Player player2, int Turns){
	
	Turn = 1;
	System.out.println("Beginning turn #" + Turn);
	System.out.println("");

	
	while (Turns != Turn) {
	    System.out.println("Beginning turn #" + Turn);
	    Turn = Turn + 1;
	    BettingAmount = 10000;
	    player1.getBankAccount().withdraw(BettingAmount);
	    player2.getBankAccount().withdraw(BettingAmount);
	    moneyPot = moneyPot + (2 * BettingAmount);

	    CoinFace1 = player1.getFace();
	    CoinFace2 = player2.getFace();
	    
	    if (player1.getBankAccount().getBalance() > 0 &&
		player2.getBankAccount().getBalance() > 0) {
	    
	    System.out.println("$" + BettingAmount + "was put into the pot.");
	    
	    System.out.println("Player 1's coin is..." + CoinFace1 + "!" );
	    System.out.println("Player 2's coin is..." + CoinFace1 + "!" );
	    
	    if (CoinFace1.equals("Heads")
		&& CoinFace1.equals("Heads")){
		
		player1.getBankAccount().deposit(moneyPot);
		moneyPot = 0;
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("Player 1 is the winner! You get $" + moneyPot);
		
	    
	    }
	    
	    if (CoinFace1.equals("Tails")
		&& CoinFace2.equals("Tails")){
		
		player2.getBankAccount().deposit(moneyPot);
		moneyPot = 0;
		System.out.println("Player 2 is the winner! You get $" + moneyPot);
	    }
		
	    

	   
   	    

	    }}}}

	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
    



	


		
    


    
    


    
