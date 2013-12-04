public class Driver {
    public static void main(String[]  args) {
	CoinGame v = new CoinGame();
	v.play(10);

	System.out.println("P1 now has " + v.getP1Balance());
	System.out.println("P2 now has " + v.getP2Balance());

	while (!v.getGameOver()) {
	    
	    System.out.println("P1 now has $" + v.getP1Balance());
	    System.out.println("P2 now has $" + v.getP2Balance());
	    System.out.println("The pot is now $" + v.getPot() + "\n");
	    v.play(1);
	}
	
	System.out.println("Final P1: $" + v.getP1Balance());
	System.out.println("Final P2: $" + v.getP2Balance());
    }
}
