import java.io.*;
import java.util.*;

public class CoinGame{
    Coin c1 = new Coin();
    Coin c2 = new Coin();
    BankAccount p1 = new BankAccount("Alicia",123,500.00);
    BankAccount p2 =new BankAccount("Christina",456,500.00);
    double pot = 0;
    public void addToPot(){
	amt = Math.random() * 10;
	p1.withdraw(amt);
	p2.withdraw(amt);
	pot = amt * 2 + pot;
    }
}
	