public class CoinPurse {
    private double Amount;
	
	public CoinPurse(double a) {
		Amount = a;
	}
    
	public double getAmount() {
		return Amount;
	}
	
    public void addTo(Coin c) {
		Amount += c.getValue();
    }
	public void removeFrom(Coin c) {
		if (Amount < c.getValue()) {
			System.out.println("Insufficient Amount");
		}
		else {
			Amount -= c.getValue();
		}
	}
}