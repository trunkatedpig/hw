import java.util.*;

public class CoinGame{
    private BankAccount p1, p2;
    private coin c1,c2;
    private Random pot = new Random();
    public CoinGame(double a,double b){
	p1=new BankAccount("p1",1);
	p1.deposit(a);
	p2=new BankAccount("p2",2);
	p2.deposit(b);
	c1 = new coin();
	c2 = new coin();
    }
    public void turn(){
	double p = pot.nextDouble();
	p = p * 1000;
	c1.flip();
	c2.flip();
	if (p1.getBalance() > 0 || p2.getBalance() > 0){
	    if (c1.getFace() == "Heads" && c2.getFace() == "Heads"){
		if (p2.getBalance() < p){
		    p = p2.getBalance();
		}
		p1.takeMoneyFrom(p2, p);
	    }
	    else if (c1.getFace() == "Tails" && c2.getFace() == "Tails"){
		if (p1.getBalance() < p){
		    p=p1.getBalance();
		}
		p2.takeMoneyFrom(p1, p);
	    }
	    else{
		turn(p);
	    }
	}
    }
    public void turn(double stillinpot){
	double p = pot.nextDouble();
	p = p * 1000;
	p = p + stillinpot;
	c1.flip();
	c2.flip();
	if (c1.getFace() == "Heads" && c2.getFace() == "Heads"){
	    if (p2.getBalance() < p){
		p = p2.getBalance();
	    }
	    p1.takeMoneyFrom(p2, p);
	}
	else if (c1.getFace() == "Tails" && c2.getFace() == "Tails"){
	    if (p1.getBalance() < p){
		p = p1.getBalance();
	    }
	    p2.takeMoneyFrom(p1, p);
	}
	else{
	    turn(p);
	}
    }
    //I tried to round to the cents, but it did not work
    public double getP1(){
	double result =  Math.round(p1.getBalance()*100)/100;
	return result;
    }
    public double getP2(){
	double result =  Math.round(p2.getBalance()*100)/100;
	return result;
    }
    public String returnPlay(int z){
	int i = 0;
	while (i < z){
	    turn();
	    i = i + 1;
	}
	double result1 = Math.round(p1.getBalance()*100)/100;
	double result2 = Math.round(p2.getBalance()*100)/100;
	if (p1.getBalance() > p2.getBalance()){
	    return "Player 1 wins with " + result1 + " whereas player 2 only has " + result2;
	}
	else if (p2.getBalance() > p1.getBalance()){
	    return "Player 2 wins with " + result2 + " whereas player 1 only has "+ result1;
	}
	else {
	    return "It's a tie!";
	}
    }
    public void play(int z){
	int i = 0;
	while (i < z){
	    turn();
	    i = i + 1;
	}
    }
    //just to see
    public int getTosses(){
	return c1.getTosses();
    }
}
