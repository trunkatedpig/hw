public class Driver {
    public static void main(String[] args) {
	CoinGame game = new CoinGame("Bob", "Joe");

	System.out.println();
	System.out.println();
	System.out.println("GAME 1");
	System.out.println("---------------------------------");
	game.play(10, true);
	System.out.println();
	System.out.println();
	System.out.println("GAME 2");
	System.out.println("---------------------------------");
	game.play(100, false);
	System.out.println();
	game.play(50, false);
	System.out.println();
	game.play(5, false);
	System.out.println();
    }
}
