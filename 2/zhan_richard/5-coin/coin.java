public class coin{
    private String face;
    private int flips,heads,tails, fairness;
    public coin(){
        flips = 0;
        heads = 0;
	tails = 0;
    }
    public void flip(){
	// face = Heads or Tails
	flips = flips + 1;
	// heads = heads + 1 or tails = tails + 1
    }
    public void resetFlips(){
	flips = 0;
	heads = 0;
	tails = 0;
    }
    public String getFace(){
	return face;
    }
}

