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

		play(100);
		System.out.println("100 rounds");
		System.out.println(accountA);
		System.out.println(accountB);
		play(100);
		System.out.println("200 rounds");
		System.out.println(accountA);
		System.out.println(accountB);
		play(100);
		System.out.println("300 rounds");
		System.out.println(accountA);
		System.out.println(accountB);
		play(100);
		System.out.println("400 rounds");
		System.out.println(accountA);
		System.out.println(accountB);
		
		
	}  

   	public static void turn(double i)
	{
		
		double min = Math.min(accountA, accountB);//picks out the smaller of the two
		if(i > min)
				i = min;//can't take more than smallest account
		
	    pot+= 2 * i;
	    accountA -=i;
	    accountB -=i;
	    coinA.faceFlip();
	    coinB.faceFlip();
	    if (coinA.sameFace(coinB)){
			if (coinA.getFace() == "Heads"){
				accountA+=pot;
				pot=0;
			}
			else
			{
				accountB += pot;
				pot = 0;
			}
	    }
		//otherwise pot stays and nothing else happens
	}

	public static void play(int n)
	{
		for(int i = 0; i < n; i++)//loops n times
		{
				int temp = r.nextInt(20);//gets a random integer from 1-20
				turn(temp);
		}
	}

	
}
