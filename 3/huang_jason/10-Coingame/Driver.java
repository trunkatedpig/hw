public class Driver{

    public static void main(String[] args){
	
	CoinGame c = new CoinGame();
	
	System.out.println("Player 1: $" + c.getBankAccount1().getBalance());
	System.out.println("Player 2: $" + c.getBankAccount2().getBalance());

	c.turn();

	System.out.println("Player 1: $" + c.getBankAccount1().getBalance());
	System.out.println("Player 2: $" + c.getBankAccount2().getBalance());

	c.play(20);

	System.out.println("Player 1: $" + c.getBankAccount1().getBalance());
	System.out.println("Player 2: $" + c.getBankAccount2().getBalance());
    }
}