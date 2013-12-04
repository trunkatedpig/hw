
public class Coin {
    private String face;
    private int tosses;
    private int heads;
    private int tails;
    private double prob;
    private int value;
    private String name;

    public void initCoin(String f, Double p, int v) {
	face = f;
	tosses=0;
	heads=0;
	tails=0;
	prob=p;
	value=v;
	if (value==1){
	    name = "penny";
	}
	if (value==5){
	    name = "nickel";
	}
	if (value==10){
	    name = "dime";
	}
	if (value==25){
	    name = "quarter";
	}
    }

    public Coin(int v) {
	initCoin("Heads",0.5,v);
    }
    public Coin() {
	initCoin("Heads",0.5,1);
    }
    public Coin(String f) {
	initCoin(f,0.5,1);
    }
    public Coin(String f, int v) {
	initCoin(f,0.5,v);
    }
    

    public int getValue(){
	return value;
    }
    public String getFace() {
	return face;
    }
    public int getFlips(){
	return heads + tails;
    }

    public boolean sameFace(Coin other) {
	return face.equals(other.getFace());
    }

    public String faceFlip() {
	if (Math.random() < prob) {
	    face = "Heads";
	    heads ++;
	}
	else {
	    face = "Tails";
	    tails ++;
	}
	return face;
    }
}
