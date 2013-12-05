public class Coin {
    private String face;
    private int flips, heads;
    private double fairness;

    public Coin() {
	face = "Unflipped";
	flips =  heads = 0;
	fairness = 50;
    }

    public void resetFlips() {flips =  heads = 0;}

    public String getFace() {return face;}
}
