import java.util.*;

public class CoinGame {

    BankAccount p1, p2;
    Coin c1, c2;
    Random r = new Random();

    private int pot;

    public CoinGame(BankAccount p1, BankAccount p2, Coin c1, Coin c2) {
        this.p1 = p1;
        this.p2 = p2;
        this.c1 = c1;
        this.c2 = c2;
        pot = 0;
    }

    public CoinGame(BankAccount p1, BankAccount p2, Coin c1, Coin c2, int startPot) {
        this.p1 = p1;
        this.p2 = p2;
        this.c1 = c1;
        this.c2 = c2;
        pot = startPot;
    }

    public void turn() {
        int bet;
        bet = r.nextInt(100);
        p1.withdraw(bet);
        p2.withdraw(bet);
        pot = pot + (bet * 2);

        c1.flip();
        c2.flip();
        if (c1.getSide().equals(c2.getSide()) && c1.getSide().equals("Heads")) {
            p1.deposit(pot);
            System.out.println("Player 1 gets $" + pot + "!");
            pot = 0;
        }
        else if (c1.getSide().equals(c2.getSide()) && c1.getSide().equals("Tails")) {
            p2.deposit(pot);
            System.out.println("Player 2 gets $" + pot + "!");
            pot = 0;
        }
    }

    public void play(int n) {
        while (n > 0) {
            turn();
            n = n - 1;
        }
    }

    public int getPot() {
        return pot;
    }
}
