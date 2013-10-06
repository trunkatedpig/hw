public class Driver{
    public static void main(String args[]){
	/*	Coin first;
	first=new Coin();
	first.resetCount();
	System.out.println(first.getFace());
	System.out.println(first.flipCoin());
	System.out.println(first.getFace());
	System.out.println(first.headsN());
	System.out.println(first.tailsN());
	*/
	Coin coin;
	coin=new Coin("quartesr");
	CoinPurse purse;
	purse= new CoinPurse();
	purse.addTo(coin);
	purse.removeFrom(coin);
	purse.removeFrom(coin);
	purse.removeFrom(coin);
	System.out.println(purse.amount);
    }


}
