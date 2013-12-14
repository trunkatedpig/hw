import java.io.*;
import java.util.*;

public class DriverCoin{
    public static void main(String[] args){
	Coin sweyn = new Coin("quarter",0.25);
	CoinPurse one = new CoinPurse(0.05);
	one.addTo(sweyn);
	System.out.println("With a probability of 0.5, the face is " + sweyn.toss());
	sweyn.setRandProb();
	System.out.println("With a random probaility, the face is " + sweyn.toss());
        System.out.println(one.getAmount());
        System.out.println(one.getNum());
    }
			   
}
