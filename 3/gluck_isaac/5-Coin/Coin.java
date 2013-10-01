public class Coin {
    public String face;
    public int count;
    public int prob;

    /*
    public Coin() {
	
    }
    */

    public void setCount(int n) {
	count = n;
    }

    public void resetCount() {
	setCount(0);
    }

    public String getFace() {
	return face;
    }
}
