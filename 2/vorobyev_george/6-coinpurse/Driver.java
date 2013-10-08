import java.io.*;

public class Driver
{
	public static void main(String[] args)
	{
		Coin b = new Coin(10,"dime");
		Coin c = new Coin(5,"nickel");
		CoinPurse cp = new CoinPurse();
		cp.addTo(b);
		cp.removeFrom(c);
		System.out.println(cp.getAmount());
	}

}
