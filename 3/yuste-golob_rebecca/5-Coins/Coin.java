public class Coin {
    private String face;
    private int flips, heads, tails;
    private float fairnesss;
    
    public void reset(){
	flips = 0;
	heads = 0;
	tails = 0;
    }

    public String getFace(){
	return face;
    }
}
