public class Driver {
    public static void main(String[] args) {
<<<<<<< HEAD
	// Not so sure what to do at this point
	// so I left it be.
=======
	Coin c = new Coin();
	// Iterate this stuff 1000 times.
	for (int i = 0; i < 1000; i++) {
	    c.flip();
	    System.out.println(c.getFace());
	}
	System.out.println(c.getHeads() + " + " + c.getTails() + " = " + c.getFlips());	
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
    }
}