

public class Coin
{
	String face;
	int numHeads, numTails;
	float fractionHeads;

	public Coin()
	{
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
