public class CoinPurse{
	private double amount;
	private Coin coin;
	
	public void initValue(double amt){
		amount=amt;
	}
	
	public CoinPurse(){
		initValue(0.00);
	}
	
	
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