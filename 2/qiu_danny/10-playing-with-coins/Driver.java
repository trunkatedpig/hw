import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {
        BankAccount p1, p2;
        p1 = new BankAccount(1000);
        p2 = new BankAccount(1000);

        Coin c1, c2;
        c1 = new Coin();
        c2 = new Coin();

        CoinGame game;
        game = new CoinGame(p1, p2, c1, c2, 666);

        if (args.length == 1) {
            game.play(Integer.parseInt(args[0]));
        }
        else {
            game.play(100);
        }

        System.out.println("Player 1 Money: " + p1.getMoney());
        System.out.println("Player 2 Money: " + p2.getMoney());
        System.out.println("Money left in pot: " + game.getPot());
    }
}
