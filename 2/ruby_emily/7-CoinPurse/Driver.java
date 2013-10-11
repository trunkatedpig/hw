import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	Coin c;
	CoinPurse cp;
	cp=new CoinPurse();
	c= new Coin("quarter",0.25);
	System.out.println(c.getFace());
	System.out.println(c.getValue());
	cp.removeFrom(c);
	System.out.println(cp.getAmount());
	
    }

}
