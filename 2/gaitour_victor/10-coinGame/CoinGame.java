import java.io.*;
import java.util.*;

public class CoinGame{
    private int pot;
    private BankAccount p1,p2;
    private Coin a,b;
    private int withdrawamount;
    public CoinGame(BankAccount bankAccount1, BankAccount bankAccount2) {
        this.p1 = bankAccount1;
        this.p2 = bankAccount2;
        this.a=new Coin();
        this.b=new Coin();
    }
    public String status(){
	return "p1 balance is " + ""+p1.getBalance()+"p2 balance is" + "" + p2.getBalance();}
    public void makepot(){
	withdrawamount=prob.nextInt(100);
        pot = (p1.withdraw(withdrawamount)+p2.withdraw(withdrawamount));
}
    public void turn(){
	a1=a.flip();
	b1=b.flip();
	if ((a1.equals("heads")) && (b1.equals("heads")){
	    p1.deposit(pot);
	    pot=0;}
	if ((a1.equals("tails")) && (b1.equals("tails")){
	    p1.deposit(pot);
	    pot=0;}
}
    public void play(int n){
	while (n>0){
	   turn();
	   n=n-1;
	
	}
    }
}