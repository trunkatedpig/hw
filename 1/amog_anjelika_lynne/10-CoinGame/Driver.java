import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	BankAccount p1, p2;
	p1 = new BankAccount("Player 1", 20.00);
	p2 = new BankAccount("Player 2",  20.00);
	CoinGame g;
	g = new CoinGame(p1, p2);
	g.play(10);
	System.out.println(g.getPot());
	System.out.println(g.getp1Wins());
	System.out.println(g.getp2Wins());
    }
}