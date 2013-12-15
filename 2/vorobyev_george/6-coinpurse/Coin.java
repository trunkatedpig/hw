

public class Coin
{
	String face;
	public int value;//in cents
	String name;//quarter,nickel,etc
	int numHeads, numTails;
	float fractionHeads;

	public Coin(int v, String n)
	{
		value = v;
		name = n;
		face = "Edge";
		fractionHeads = 0.5f;
	}

	public void reset()
	{
		numHeads = 0;
		numTails = 0;
	}

	public String getFace()
	{
		return face;
	}
}
