public class Driver{
    public static void main ( String[] args){
	CoinGame x = new CoinGame();
	x.BankAccounts();
	x.play(5);
	System.out.println(x.winning());
	System.out.println(x.getPot());
    }
}
