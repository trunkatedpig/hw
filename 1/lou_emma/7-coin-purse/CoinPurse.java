public class CoinPurse{
	private double amount;
	private Coin coin;
	
	public void addTo(Coin c){
	coin=c
		amount+=coin.getValue();
	}
	
	public void removeFrom(Coin c){
	coin=c
		amount-=coin.getValue();
	}
	
	
}