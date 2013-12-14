public class Coin {
    private String face, name;
    private int tosses;
    private int heads;
    private double coinValue, prob = 0.5; // another way to initialize

    public void initCoin(String f, Double p) {
	face = f;
	tosses=0;
	heads=0;
	prob=p;
    }

    public void reset(){
	tosses=0;
	heads=0;
	name="penny";
	coinValue=0.01;
    }


    public Coin() {
	initCoin("Heads",0.5);
    }

 /*   public Coin(String f) {
	initCoin(f,0.5);
    }
	*/
	public Coin (String n){
		name=n;
		if (n == "penny") {
	    coinValue = 0.01;
		}
	else if (n == "nickel"){
	    coinValue = 0.05;
	}
	else if (n== "dime"){
	    coinValue = 0.1;
	}
	else {
	    coinValue = 0.25;
	}
}
	
	 public Coin(double v){
	coinValue = v;
	if (v == .01){
	    name = "penny";
	}
	else if (v == .05){
	    name = "nickel";
	}
	else if (v == .1){
	    name = "dime";
	}
	else{
	    name = "quarter";
	}
 }

    public String getFace() {
	return face;
    }
	
	public int getTosses(){
		return tosses;
	}
	
	public int getHeads(){
		return heads;
	}
	
	public double getValue() {
	return coinValue;
    }
	
    public String getName() {
	return name;
    }

    public boolean equals(Coin other) {
	return face.equals(other.getFace());
    }

    public void flip (){
	double random=Math.random()+.1;
	tosses=tosses+1;
	if (random >=prob){
	     face="Heads";
		 heads=heads+1;
		 }
		 
	else {
		face="Tails";
		
	}
		 
    }
    
}
