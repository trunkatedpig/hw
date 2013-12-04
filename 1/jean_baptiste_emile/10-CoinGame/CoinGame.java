import java.io.*;
import java.util.*;

public class CoinGame {
private BankAccount pot = new BankAccount("Pot",0000);
private Coin c1 = new Coin();
private Coin c2 = new Coin();
private BankAccount p1 = new BankAccount("P1",0001);
private BankAccount p2 = new BankAccount("P2",0002);
private double bet = 0.0;

public void addToPot() {
double r,m;
m = max(p1.getBalance(), p2.getBalance())
r = Math.random() * m;
p1.giveMoneyTo(pot,r);
p2.giveMoneyTo(pot,r);
bet = pot.getBalance();
}

public void events() {
c1.flip();
c2.flip();
if (c1.getFace().equals(c2.getFace()) && 
c1.getFace().equals("Heads"))
pot.giveMoneyTo(p1,bet);
else if (c1.getFace().equals(c2.getFace()) && 
c1.getFace().equals("Tails"))
pot.giveMoneyTo(p2,bet);
}

public void turn() {
addToPot()
events()
}

public void play(int n) {
while (n > 0) {
turn()
n = n - 1
}
if (p1.getBalance() > p2.getBalance()) {
System.out.println("Player 1 Wins With " + p1.getBalance() + " In The Bank")
}
else if (p1.getBalance() < p2.getBalance()) {
System.out.println("Player 2 Wins With " + p2.getBalance() + " In The Bank")
}
else {
System.out.println("There appears to be no clear winner")
}
}
}