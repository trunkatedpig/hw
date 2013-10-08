import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	CoinPurse cp1 = new CoinPurse();
	Coin c1 = new Coin("quarter");
	Coin c2 = new Coin("dime");
	System.out.println(cp1.getAmount());
	cp1.addTo(c1);
	cp1.removeFrom(c2);
	System.out.println(cp1.getAmount());
    }
}

