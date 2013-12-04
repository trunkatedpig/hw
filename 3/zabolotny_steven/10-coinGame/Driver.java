public class Driver {
    public static void main(String[] args) {
	CoinGame cg = new CoinGame();
	int n = 0;
	System.out.println(cg.results());
	while (n < 5) {
	cg.play(1);
	System.out.println(cg.results());
	n = n + 1;}
    }
}