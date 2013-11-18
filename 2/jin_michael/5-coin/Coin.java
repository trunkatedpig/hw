public class Coin{
    //0=heads 1=tails
    //hh=# heads tt=# tails
<<<<<<< HEAD
    private int ht;
    private int hh;
    private int tt;
    private int percentage;

    public Coin(){
	ht=0;
	hh=0;
	tt=0;
	percentage=50;
    }
    public void setCount(){
=======
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
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
	hh=0;
	tt=0;
    }

<<<<<<< HEAD
    public int getFace(){
	return ht;
    }

=======
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
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
}
