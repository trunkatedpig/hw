public class Coin{
    //0=heads 1=tails
    //hh=# heads tt=# tails
    private String ht;
    private int hh;
    private int tt;
    private double percentage;
    //1-5
    //6-10
    public Coin(){
	ht="heads";
	hh=0;
	tt=0;
	percentage=.5;
    }
    public void resetCount(){
	hh=0;
	tt=0;
    }

    public String getFace(){
	return ht;
    }

    public String flipCoin(){
	double N;
	N=Math.random();
	if (N<percentage)
	    {hh=hh+1;
		ht="heads";}
	else{tt=tt+1;
		ht="tails";
	}
	return ht;
    }

    public int headsN(){
	return hh;
    }

    public int tailsN(){
	return tt;
    }
}
