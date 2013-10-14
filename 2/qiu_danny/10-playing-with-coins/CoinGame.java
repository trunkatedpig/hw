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
        if (p1.getMoney() <= 0) {
            System.out.println("Player 1 does not have any money left to play!");
            return;
        }
        else if (p2.getMoney() <= 0) {
            System.out.println("Player 2 does not have any money left to play!");
            return;
        }

        int bet;
        bet = r.nextInt(100);

        if (bet > p1.getMoney() || bet > p2.getMoney()) {
            bet = Math.min(p1.getMoney(), p2.getMoney());
        }

        p1.withdraw(bet);
        p2.withdraw(bet);
        pot = pot + (bet * 2);

        c1.flip();
        c2.flip();
        if (c1.getSide().equals(c2.getSide()) && c1.getSide().equals("Heads")) {
            p1.deposit(pot);
            pot = 0;
        }
        else if (c1.getSide().equals(c2.getSide()) && c1.getSide().equals("Tails")) {
            p2.deposit(pot);
            pot = 0;
        }
    }

    public void play(int n) {
        while (n > 0) {
            if (p1.getMoney() <= 0) {
                System.out.println("Player 1 does not have any money left to play!");
                break;
            }
            else if (p2.getMoney() <= 0) {
                System.out.println("Player 2 does not have any money left to play!");
                break;
            }
            else {
                turn();
                n = n - 1;
            }
        }
    }

    public int getPot() {
        return pot;
    }
}
