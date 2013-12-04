public class Driver {
    public static void main(String[] args) {
	Coin x = new Coin(0.5); //probability of 0.5
	
	//loops it 10x
	int loopVal;
	int stop = 10;
	
	for (loopVal = 0; loopVal < stop; loopVal++) {
	
	x.flip();
	System.out.println(x.getFace());
	System.out.println("Num of Flips: " + x.getCounts());
	System.out.println("Num of heads: " + x.getHeads());
	System.out.println("Num of tails: " + x.getTails());
	System.out.println("<--------------------------------------------->");
		}
    }
}