public class CoinPurse{
	private double amount;
	private Coin coin;
	
	public CoinPurse(int amt);
	amount=amt;
	
	public void addTo(Coin c){
	coin=c;
		amount+=coin.getValue();
	}
	
	public void removeFrom(Coin c){
	coin=c;
		amount-=coin.getValue();
	}
	
	public double getAmount(){
		return amount;
	}
	
	
}