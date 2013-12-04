public class Coin{
    //0=heads 1=tails
    //hh=# heads tt=# tails
    private String ht;
    private double percentage;
    //1-5
    //6-10
    public Coin(){
	ht="heads";
	percentage=.5;
    }

    public String getFace(){
	return ht;
    }

    public String flipCoin(){
	double N;
	N=Math.random();
	if (N<percentage)
	    {ht="heads";}
	else{ht="tails";
	}
	return ht;
    }

}
