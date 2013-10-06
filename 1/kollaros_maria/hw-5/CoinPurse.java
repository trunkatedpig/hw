public class CoinPurse{
    private double amount;
    private int numberOfCoins;

    public CoinPurse(){
	amount = 0.00;
	numberOfCoins = 0;
    }

    public CoinPurse(double a){
	amount = a;
	numberOfCoins = 1;
    }

    public CoinPurse(Coin c){
	amount = c.getAmount();
	numberOfCoins = 1;
    }

    public void addTo(Coin c){
	numberOfCoins += 1;
	amount += c.getAmount();
    }

    public void removeFrom(Coin c){
	numberOfCoins -= 1;
	amount -= c.getAmount();
    }

    public double getAmount(){
	return amount;
    }

    public int getNum(){
	return numberOfCoins;
    }
}
