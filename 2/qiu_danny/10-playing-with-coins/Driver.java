import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {
        BankAccount p1, p2;
        p1 = new BankAccount("Player 1", 1000);
        p2 = new BankAccount("Player 2", 1000);

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

        System.out.println(p1.getName() + " has $" + p1.getMoney());
        System.out.println(p2.getName() + " has $" + p2.getMoney());
        System.out.println("Money left in pot: " + game.getPot());
    }
}
