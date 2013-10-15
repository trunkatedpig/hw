import java.io.*;
import java.util.*;
import java.lang.*;

public class CoinGame{
          

    public static void main(String[] args){
    
    
    Player Player1;
    Player Player2;
    int BettingAmount;
    
    
    Player1 = new Player("You");
    Player2 = new Player("OtherGuy");
    
    Player1.setMoney(100000);
    Player2.setMoney(100000);
	
    System.out.println("\n");
    System.out.println("\n");
    System.out.println("\n");
    System.out.println("\n");
    System.out.println("\n");
    System.out.println("The Most Dangerous Game Initiated");
    System.out.println("\n");
    System.out.println("Distributing mad money");
    System.out.println("\n");
    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
    System.out.println("\n");
	
    System.out.println("Player1 Recieved $100000");
    System.out.println("\n");
    System.out.println("Player2 Recieved $100000");
    System.out.println("\n");
    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
	
    System.out.println("\n");
	
    System.out.println("So begins the game...");
    System.out.println("\n");
    System.out.println("First Flip");
    System.out.println("Heads to Player 1, Tails to Player 2");
    System.out.println("\n");
    System.out.println("BEGIN");
    System.out.println("\n");

    Player1.GameMatch(Player1,Player2,20);

    }}
	    
