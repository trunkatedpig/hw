import java.io.*;
import java.util.*;

public class CoinGame{
    private int pot;
    private BankAccount p1,p2;
    private Coin a,b;
    public CoinGame(){
	p1.deposit(100);
	p2.deposit(100);}
    
    private void turn(){
        pot = (p1.withdraw(math.random()*100)+p2.withdraw(math.random()*100));
	a.flip();
	b.flip();
	if ((a.getFace()=="heads" && b.getFace())=="heads"){
	    p1.deposit(pot);
	    pot=0;}
	if ((
    }
}