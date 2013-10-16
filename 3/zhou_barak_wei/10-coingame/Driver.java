public class Driver {
	public static void main(String[] args) throws InterruptedException {
		BankAccount player1 = new BankAccount("Player 1", 00000000);
		BankAccount player2 = new BankAccount("Player 2", 88888888);
		player1.deposit(10);
		player2.deposit(10);
		Coin c1 = new Coin();
		Coin c2 = new Coin();
		
		CoinGame game = new CoinGame(0, 1, player1, player2, c1, c2);
		
		game.play(10);
	}
}