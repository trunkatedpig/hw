import java.util.*;
import java.io.*;

public class CoinGame{
    Random rand = new Random();
    int pot = 0;

    BankAccount p1 = new BankAccount("Player 1",1,500);
    BankAccount p2 = new BankAccount("Player 2",2,500);
    Coin c1 = new Coin();
    Coin c2 = new Coin(); 

     public void turn(){
        int randAmount = rand.nextInt(10);
        while (randAmount == 0){
            randAmount = rand.nextInt(10);
        }
        System.out.println("Each player puts " + randAmount + " in the pot");
        p1.withdraw(randAmount);
        p2.withdraw(randAmount);
        pot = pot + (2 * randAmount);
        c1.flip();
        c2.flip();
        System.out.println("c1: " + c1.getFace());
        System.out.println("c2: " + c2.getFace());
        if (c1.getFace().equals("Heads") && c2.getFace().equals("Heads")){
            System.out.println("They are both heads! Player 1 wins the money");
            p1.deposit(pot);
            pot = 0;
        }else if(c1.getFace().equals("Tails") && c2.getFace().equals("Tails")){
            System.out.println("They are both tails! Player 2 wins the money");
            p2.deposit(pot);
            pot = 0;
        }else{
            System.out.println("They are not same. No one wins the money");
        }
    }
    
    public void play(int n){
        int counter = 1;
        while (counter <= n){
           System.out.println("Turn " + counter);
           System.out.println("The amount of money in pot: " + pot);
           System.out.println("The balance of player 1: " + p1.getBalance());
           System.out.println("The balance of player 2: " + p2.getBalance());
           turn();
           System.out.println("The end of turn " + counter);
           System.out.println("Balance of p1 is " + p1.getBalance());
           System.out.println("Balance of p2 is " + p2.getBalance());
           System.out.println("The amount of money in pot:  " + pot);
           System.out.println("");
           counter ++; 
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("The end of the game");
        System.out.println("Balance of p1 is " + p1.getBalance());
        System.out.println("Balance of p2 is " + p2.getBalance());
        if (p1.getBalance() > p2.getBalance()){
            System.out.println("Winner: Player 1");
        }else if(p1.getBalance() == p2.getBalance()){
            System.out.println("Tie");
        }else{
            System.out.println("Winner: Player 2");
        }

    }
}
