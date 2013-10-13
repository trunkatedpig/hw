public class Driver{
    public static void main(String args[]){ 
	BankAccount aaa,bbb;
	Coin yyy,zzz;
	CoinGame gamble;

	aaa=new BankAccount("Michael", 1000);
        bbb=new BankAccount("David", 1000);
        yyy=new Coin();
        zzz=new Coin();
	gamble=new CoinGame(aaa, bbb, yyy, zzz);

	System.out.println(gamble.playgamextimes(1000));
    }
}
