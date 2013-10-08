import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {
        Purse p;
        Coin c1, c2, c3, c4;

        p = new Purse();
        c1 = new Coin();
        c2 = new Coin("quarter");
        c3 = new Coin(1025);
        c4 = new Coin("golden coin", .666);

        p.addCoin(c1);
        p.addCoin(c2);
        p.addCoin(c3);
        p.addCoin(c4);

        Coin[] coins = p.getCoins();
        String coinObjects = "";
        for (int x = 0; x < coins.length; x++ ) {
            Coin c = coins[x];
            if (c != null) {
                coinObjects += coins[x] + ", ";
            }
        }
        System.out.println(coinObjects); // Prints location of coins in memory
        System.out.println("coins:  " + p.getCoinTypes());
        System.out.println("values: " + p.getCoinValues());
        System.out.println("Total purse value: " + p.getTotalValue());

        p.removeCoin(c1);
        p.removeCoin(c1);
        System.out.println("coins:  " + p.getCoinTypes());
        System.out.println("values: " + p.getCoinValues());
        System.out.println("Total purse value: " + p.getTotalValue());

        p.lose(); // Method for emptying purse
        System.out.println("coins:  " + p.getCoinTypes());
        System.out.println("values: " + p.getCoinValues());
        System.out.println("Total purse value: " + p.getTotalValue());
    }
}
