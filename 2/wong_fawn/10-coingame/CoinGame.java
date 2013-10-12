import java.io.*;
import java.util.*;

public class CoinGame {
    private Coin p1Coin = new Coin(), p2Coin = new Coin();
    private BankAccount p1Account = new BankAccount(), p2Account = new BankAccount();
    private double pot;
    private Random r = new Random();
    
    p1Account.deposit(100.0);
    p1Account.deposit(100.0);
    
    public void addToPot() {
	double amt = (double)(r.nextInt(100));
	p1Account.withdraw(amt);
	p2Account.withdraw(amt);
	pot = 2 * amt;
    }
    
    public void turn() {
	p1Coin.flip();
	p2Coin.flip();
	if (p1Coin.getFace().equals(p2Coin.getface()) {
    }