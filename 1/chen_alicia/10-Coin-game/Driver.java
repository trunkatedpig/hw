import java.io.*;
import java.util.*;
public class Driver {
public static void main (String [] args) {
    CoinGame game = new CoinGame ();
    game.play(5);
    System.out.println("\n" + "Final Results: "  +"\n" + game.getBalances());
    System.out.println(game.winner());
}}
