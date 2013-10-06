import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {
        Purse p;
        Coin c1, c2, c3;

        p = new Purse();
        c1 = new Coin();
        c2 = new Coin();
        c3 = new Coin();

        p.addCoin(c1);
        p.addCoin(c2);
        p.addCoin(c3);
        Coin[] coins = p.getCoins();
        String coinObjects = "";
        for (int x = 0; x < coins.length; x++ ) {
            Coin c = coins[x];
            if (c != null) {
                coinObjects += coins[x] + ", ";
            }
        }
        System.out.println(coinObjects);
        System.out.println(p.getCoinTypes());
        System.out.println(p.getCoinValues());
        System.out.println(p.getTotalValue());

        p.removeCoin(c1);
        p.removeCoin(c1);
        System.out.println(p.getCoinTypes());
        System.out.println(p.getCoinValues());
        System.out.println(p.getTotalValue());
    }
}
