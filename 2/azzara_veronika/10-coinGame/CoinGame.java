import java.util.*;

public class CoinGame{
	static Coin coinA,coinB;
	static double accountA, accountB;
	static double pot;
	static Random r;
	
	public static void main(String[] args)
	{
		coinA = new Coin();
		coinB = new Coin();
	
		accountA = accountB = 1000;
		r = new Random();
	}  

    public void turn(double i)
	{
	    double z = math.min
	    pot+=i;
	    accountA -=i/2;
	    accountB -=i/2;
	    coinA.faceFlip();
	    coinB.faceFlip();
	    if (coinA.sameFace(coinB)){
		if (coinA.getFace() == "Heads"){
		    accountA+=pot;
		    pot=0;
		}
	    }
	}
}
