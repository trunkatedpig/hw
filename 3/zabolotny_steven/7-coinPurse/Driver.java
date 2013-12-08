import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
Coin c;
c = new Coin("Quarter",0.25);
CoinPurse cp;
cp = new CoinPurse();
cp.addTo(c);
cp.addTo(c);
cp.removeFrom(c);
System.out.println("CoinPurse \n" + String.valueOf(cp.getAmount()) + " should be 0.25.\n\n\nCoinFlip");
c.flip();
System.out.println(c.getFace());
System.out.println(c.getFlips());
System.out.println(c.getFair() + "\n");
c.flip();
System.out.println(c.getFace());
System.out.println(c.getFlips());
System.out.println(c.getFair() + "\n");
c.flip();
System.out.println(c.getFace());
System.out.println(c.getFlips());
System.out.println(c.getFair() + "\n");
c.flip();
System.out.println(c.getFace());
System.out.println(c.getFlips());
System.out.println(c.getFair() + "\n");
c.flip();
System.out.println(c.getFace());
System.out.println(c.getFlips());
System.out.println(c.getFair() + "\n");
    }
}