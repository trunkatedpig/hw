public class Coin{
    private boolean face;
    private int counts;
    private double fair;

    public Coin(boolean f, int c, double p){
	face = f;
	counts = c;
	fair = p;
    }
	
    public void resetCounts(){
	counts = 0;
    }
    public boolean getFace(){
	return face;
    }
}
