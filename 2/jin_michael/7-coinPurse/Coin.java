public class Coin{
    //ht=heads or tail of the flip hh=# heads tt=# tails
    private String ht;
    private int hh;
    private int tt;
    private double percentage;
    private int penny=1;
    private int nickel=5;
    private int dime=10;
    private int quarter=25;
    public int value;

    public Coin(){
	ht="heads";
	hh=0;
	tt=0;
	percentage=.5;
	//percentage is the chance of getting heads!
    }

    public Coin(String coinType){
	if (coinType=="penny"){
	    value=penny;}
	else if(coinType=="nickle"){
	    value=nickel;}
	else if(coinType=="dime"){
	    value=dime;}
	else if(coinType=="quarter"){
	    value=quarter;}
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
