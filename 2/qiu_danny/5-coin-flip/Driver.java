import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {
        Coin c;
        c = new Coin();
        
        for (int x = 0; x < 100; x++) {
            c.flip();
        }
        System.out.println("Heads or Tails: " + c.getFace());
        System.out.println("Total Flips: " + c.getFlips());
        System.out.println("Total Heads: " + c.getHeads());
        System.out.println("Total Tails: " + c.getTails());

        System.out.println("\nFair\n------\nCheater\n");

        Coin cheater;
        cheater = new Coin(.9);

        for (int x = 0; x < 100; x++) {
            cheater.flip();
        }
        System.out.println("Heads or Tails: " + cheater.getFace());
        System.out.println("Total Flips: " + cheater.getFlips());
        System.out.println("Total Heads: " + cheater.getHeads());
        System.out.println("Total Tails: " + cheater.getTails());
        
        cheater.reset();
        System.out.println("Reset totals: " + cheater.getFlips() + ", " + cheater.getHeads() + ", " + cheater.getTails());
    }
}
