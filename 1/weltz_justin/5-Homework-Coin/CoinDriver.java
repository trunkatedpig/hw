import java.io.*;
import java.util.*;
public class CoinDriver{
    public static void main(String[] args) {
	Coin g;
	g = new Coin();
	g.setHeads(5);
	g.setFlips(10);
	System.out.println(g.getHeads());
	System.out.println(g.getFlips());
	g.ResetCounts();
	System.out.println(g.getHeads());
	System.out.println(g.getFlips());
	System.out.println(g.getFace());
    }
 }
