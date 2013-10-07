public class Coin{

    private String face;
    private int flip;
    private int heads;
    private int tails;
    private double fairness;

    public void resetCount(){
	flip = 0;
	heads = 0;
	tails = 0;
	fairness = 0;
    }

    public String getFace(){
	return face;
    }

    public void initCoin(String faceht, double fair){
	face = faceht;
	flip = 0;
	heads = 0;
	tails = 0;
	fairness = fair;
    }

    public Coin(){
	initCoin("Heads",0.5);
    }

    public Coin(String faceht){
	initCoin(faceht,0.5);
    }

    public boolean equals(Coin othercoin){
	if (getFace().equals(othercoin.getFace()))
	    return true;
	else
	    return false;
    }
}