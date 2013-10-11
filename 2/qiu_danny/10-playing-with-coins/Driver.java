import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {
        BankAccount p1, p2;
        p1 = new BankAccount();
        p2 = new BankAccount();

        Coin c1, c2;
        c1 = new Coin();
        c2 = new Coin();

        CoinGame g1, g2;
        g1 = new CoinGame(p1, p2, c1, c2);
        g2 = new CoinGame(p1, p2, c1, c2, 666);

        if (args.length == 1) {
            g1.play(Integer.parseInt(args[0]));
            g2.play(Integer.parseInt(args[0]));
        }
        else {
            g1.play(100);
            g2.play(100);
        }

        System.out.println("\n" + "Player 1 Money: " + p1.getMoney());
        System.out.println("Player 2 Money: " + p2.getMoney());
        System.out.println("Money in pot 1: " + g1.getPot());
        System.out.println("Money in pot 2: " + g2.getPot());
    }
}
