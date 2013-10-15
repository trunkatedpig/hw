public class Driver {
    public static void main (String[] args) {
	CoinGame x = new CoinGame();
	x.play ( 20 );
	System.out.println ( x.getScores() );
	CoinGame y = new CoinGame ( 30.0 , 100.0 );
	y.play ( 5 );
	System.out.println ( "\n" + y.getScores() );
//not sure why you need the slash n, to be honest, but if it ain't broke, don't fix it.
    }
}
