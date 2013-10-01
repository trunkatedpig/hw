public class Coin {
    // I'm not so sure what we're trying to get at this,
    // so I did my best to just set up Coin.java to the best of my
    // abilities based on the assignment.
    private String name;
    private int flips;
    private int heads;
    private int tails;
    private int fairness;
    
    public reset() {
	flips = 0;
	heads = 0;
	tails = 0;
	fairness = 0;
    }
    
}