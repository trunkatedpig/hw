//Tina Lee and Kelly Chen
import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args){
	CoinGame c1 = new CoinGame();
	c1.turn();
	c1.cleanUp();
	System.out.println("Player 1's Current Balance: " + c1.getCurrentBalance1());
	System.out.println("Player 2's Current Balance: " + c1.getCurrentBalance2());
	System.out.println("Current Pot: " + c1.getPot());
       
	CoinGame c2 = new CoinGame();
	c2.play(10); //plays 10 turns
	c2.cleanUp();
	System.out.println("Player 1's Current Balance: " + c2.getCurrentBalance1());
	System.out.println("Player 2's Current Balance: " + c2.getCurrentBalance2());
	System.out.println("Pot: " + c2.getPot());

			
    }
}
