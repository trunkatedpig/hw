import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args) {
	CoinGame c = new CoinGame();
	System.out.println(c.results());
	c.play(5);
	System.out.println("After 5 turns\n" + c.results()); 
    }
}