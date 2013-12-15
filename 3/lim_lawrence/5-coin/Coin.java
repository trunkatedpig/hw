public class Coin {
    //instance variables
    private int face;
    private int heads;
    private int tails;
    private int odds;

    //get
    public int getFace(){return face;}
    public int getHeads(){return heads;}
    public int getTails(){return tails;}
    public int getFlips(){return heads+tails;}
    public int getOdds(){return odds;}

    //set
    public void setFace(int pface){face=pface;}
    public void setHeads(int pheads){heads=pheads;}
    public void setTails(int ptails){tails=ptails;}
    public void setOdds(int podds){odds=podds;}

    //constructors
    public Coin() {
	setOdds(50);
    }
    public Coin(int podds) {
	setOdds(podds);
    }

    //methods
    /*public void flip() {

    }*/
    public void resetFlips() {
	setHeads(0);
	setTails(0);
    }
    public void print() {
	System.out.println("(-Coin!-)");
	System.out.println("  Flips: "+getFlips());
	System.out.println("  Heads: "+getHeads());
	System.out.println("  Tails: "+getTails());
	System.out.println("  Odds:  "+getOdds());
	System.out.println();
    }
}
