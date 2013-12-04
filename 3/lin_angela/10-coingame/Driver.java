public class Driver {

    public static void main(String [] args){
	Coin c = new Coin();
	CoinGame cg = new CoinGame();
	//	System.out.println(c.coinFlip());
	BankAccount bk = new BankAccount(100000);
	//System.out.println(bk.getBalance());
	//System.out.println(cg.player1Balance());
	//System.out.println(cg.player2Balance());
	/*       	cg.turn();
	System.out.println(cg.getPot());
	System.out.println(cg.player1Balance());
	System.out.println(cg.player2Balance());
	*/
	cg.play(20);
	System.out.println("Player 1's Balance: $"+cg.player1Balance());
	System.out.println("Player 2's Balance: $"+cg.player2Balance());
	System.out.println("Amount in pot:$"+cg.getPot());





    }







}
