import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {
        BankAccount b1, b2;
        Coin c1, c2;
        CoinGame game;

        b1 = new BankAccount(100.0);
        b2 = new BankAccount(100.0);

        c1 = new Coin();
        c2 = new Coin();

        game = new CoinGame(b1, b2, c1, c2);

        if (args.length == 1) {
            game.play(Integer.parseInt(args[0]));
        }
        else {
            game.play(10);
        }

        System.out.println("Player 1 Money: " + b1.getBalance());
        System.out.println("Player 2 Money: " + b2.getBalance());
        System.out.println("Money left in pot: " + game.getPot());
    }
}
