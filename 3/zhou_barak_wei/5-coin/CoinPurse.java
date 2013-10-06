public class CoinPurse {
    private double Amount;
    
	public double getAmount() {
		return Amount;
	}
	
    public void addTo(Coin c) {
		Amount += c.Value;
    }
	public void removeFrom(Coin c) {
		if (Amount < c.Value) {
			System.out.println("Insufficient Amount");
		}
		else {
			Amount -= c.Value;
		}
	}
}