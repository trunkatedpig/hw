import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {
        Coin c;
        c = new Coin();
        
        for (int x = 0; x < 100; x++) {
            c.flip();
        }
        System.out.println("Heads or Tails: " + c.getSide());
        System.out.println("Total Flips: " + c.getFlips());
        System.out.println("Total Heads: " + c.getHeads());
        System.out.println("Total Tails: " + c.getTails());

        System.out.println("\nFair\n------\nCheater\n");

        Coin cheater;
        cheater = new Coin(.9);

        for (int x = 0; x < 100; x++) {
            cheater.flip();
        }
        System.out.println("Heads or Tails: " + cheater.getSide());
        System.out.println("Total Flips: " + cheater.getFlips());
        System.out.println("Total Heads: " + cheater.getHeads());
        System.out.println("Total Tails: " + cheater.getTails());
        cheater.reset();
        System.out.println("Reset totals: " + cheater.getFlips() + ", " + cheater.getHeads() + ", " + cheater.getTails());

        System.out.println("\n------");

        Coin c1,c2;
        c1 = new Coin();
        c2 = new Coin();
        c1.flip();
        c2.flip();
        System.out.println("Coin 1 Side: " + c1.getSide() + ", Coin 2 Side: " + c2.getSide());
        System.out.println("Same? " + c1.sameSide(c2));

        System.out.println();

        Coin test;
        test = new Coin();
        for (int x = 0; x < 10000; x++) {
            test.flip();
        }
        System.out.println(test.getFlips() + ", " + test.getHeads() + ", " + test.getTails());
    }
}
