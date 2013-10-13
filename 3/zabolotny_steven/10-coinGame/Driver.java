public class Driver {
    public static void main(String[] args) {
	CoinGame cg = new CoinGame();
	System.out.println(cg.results());
	cg.play(10);
	System.out.println(cg.results());
    }
}