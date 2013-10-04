public class CoinPurse{
    private double amount;
    private int numberOfCoins;

    public CoinPurse(){
	amount = 0.0;
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

    public void addTo(Coin t){
	numberOfCoins += 1;
	amount += t.getAmount();
    }
}