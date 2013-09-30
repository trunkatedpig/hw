public class Coin {

    private String face;
    private int flips, heads, tails;
    private double percenthead;

    public void setFacehead(){
	face = "Head";
    }

    public void addCount(){
	flips = flips + 1;
    }

    public void resetCount(){
	flips = 0;
    }

    public String getFace(){
	return face;
    }

    public int getFlips(){
	return flips;
    }
}
