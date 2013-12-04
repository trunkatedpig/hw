public class Driver{
    public static void main(String[] args){
	CoinGame game;
	BankAccount P1, P2;

	P1 = new BankAccount("Cheap");
        P2 = new BankAccount("Rich");
	game = new CoinGame(P1, P2);

	System.out.println(game.result());
	game.turn();
	System.out.println(game.result());
	game.turn();
	System.out.println(game.result());
	game.play(4);
	System.out.println(game.result());
    }
}
