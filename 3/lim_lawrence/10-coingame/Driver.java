public class Driver {
    public static void main(String[] args) {
	BankAccount p1 = new BankAccount("Bonny",0);
	BankAccount p2 = new BankAccount("Xu",1);
	p1.deposit(10);
	p2.deposit(10);

	CoinGame cg = new CoinGame(p1,p2);
	cg.printStatus();
	cg.play(10);
    }
}
