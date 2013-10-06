import java.io.*;
import java.util.*;

public class DriverCoin{
    public static void main(String[] args){
	Coin sweyn = new Coin("quarter",0.25);
	Coin bob = new Coin("dime", 0.1);
	CoinPurse one = new CoinPurse(0.05);
	one.addTo(sweyn);
	System.out.println("With a probability of 0.5, the face is " + sweyn.toss());
	sweyn.setRandProb();
	System.out.println("With a random probaility, the face is " + sweyn.toss());
        System.out.println("Adding a quarter gets a total amount of " + one.getAmount());
        System.out.println("With a total number of coins " + one.getNum());
	one.removeFrom(bob);
	System.out.println("Subtracting a dime gives a total amount of " + one.getAmount());

    }

}
