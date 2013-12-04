public class Driver {
    public static void main (String[] args) {
	CoinGame x = new CoinGame();
	x.play ( 20 );
	System.out.println ( x.getScores() );
	CoinGame y = new CoinGame ( 30.0 , 100.0 );
	y.play ( 5 );
	System.out.println ( "\n" + y.getScores() );
    }
}
