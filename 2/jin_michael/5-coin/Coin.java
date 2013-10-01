public class Coin{
    //0=heads 1=tails
    //hh=# heads tt=# tails
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
	hh=0;
	tt=0;
    }

    public int getFace(){
	return ht;
    }

}
