import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String args[]) {
	BankAccount b1 = new BankAccount("Person 1", 1234);
	BankAccount b2 = new BankAccount("Person 2", 5678);
	Coin c1 = new Coin();
	Coin c2 = new Coin();
	//starting money
	b1.deposit(1000);
	b2.deposit(1000);
	
	
	CoinGame g1 = new CoinGame(b1, b2, c1, c2);

	/*g1.play(1000);
	System.out.println("After 1000 turns: ");
	System.out.println(g1.status());
	*/
	
	
	//g1.turn();
	//System.out.println(g1.status());
	
	//loops it 100x
	int loopVal;
	int stop = 100;
	
	for (loopVal = 0; loopVal < stop; loopVal++) {
	
	g1.turn();
	System.out.println(g1.status());
	System.out.println("Game: " + loopVal);
	System.out.println("<--------------------------------------------->");
	
	

	

    }


}
}
