import java.util.*;

public class CoinPurse
{
	int amount;

	public void addTo(Coin c)
	{amount += c.value;}
	public void removeFrom(Coin c)
	{amount -= c.value;}

	public int getAmount()
	{return amount;}
}
