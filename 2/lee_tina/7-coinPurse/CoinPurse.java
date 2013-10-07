//Anish Malhotra and Tina Lee
public class CoinPurse {
	private double total;
	
	public CoinPurse(double value){
		initTotal(value);
	}
	
	public CoinPurse(){
		initTotal(0.0);
	}
	
	public void initTotal(double value){
		total = value;
	}
	
	public void addTo(double value){
		total += value;
	}
	
	public void removeFrom(Coin c, double value){
		total -= value;
	}
	
	public double getAmount(){
		return total;
	}
}
