import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {
	
	CoinGame g;
	BankAccount p1, p2;

	p1 = new BankAccount("Pumbaa");
	p2 = new BankAccount("Timon");
	g = new CoinGame(p1, p2);

	System.out.println(g.status());
	g.turn();
	System.out.println(g.status());
	g.turn();
	System.out.println(g.status());
	g.play(5);
	System.out.println(g.status());

    }

}