public class Driver {
    public static void main(String[] args) {
	Coin c = new Coin();
	// Iterate this stuff 1000 times.
	for (int i = 0; i < 1000; i++) {
	    c.flip();
	    System.out.println(c.getFace());
	}
	System.out.println(c.getHeads() + " + " + c.getTails() + " = " + c.getFlips());	
    }
}