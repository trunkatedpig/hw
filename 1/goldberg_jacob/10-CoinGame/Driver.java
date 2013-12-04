public class Driver{
    public static void main(String[] args){
	BankAccount p1 = new BankAccount("Joe", 300);
	BankAccount p2 = new BankAccount("Ron", 300);
	Coin c1 = new Coin(.5, .10, "Dime");
	Coin c2 = new Coin(.5, .25, "Quarter");
	System.out.println(p2.getAcct());
	
	CoinGame cg = new CoinGame(p1, p2, c1, c2);

	cg.playLimit(80);
	/*cg.playDomination();*/
    }
}
				   
