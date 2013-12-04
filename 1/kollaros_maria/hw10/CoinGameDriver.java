import java.io.*;
import java.util.*;

public class CoinGameDriver{
    public static void main(String[] args){
	CoinGame sweyn = new CoinGame();
	CoinGame venderbush = new CoinGame();
	sweyn.turn();
	venderbush.play(100);
	System.out.println(sweyn.getPlayer1());
	System.out.println(sweyn.getPlayer2());
	System.out.println(sweyn.getPot());
	System.out.println(venderbush.getPlayer1());
	System.out.println(venderbush.getPlayer2());
	System.out.println(venderbush.getPot());
    }
 
}
