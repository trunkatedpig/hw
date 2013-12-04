public class CoinPurse{
    public int amount;

    public void addTo(Coin c){
	amount= amount + c.value;
    }

    public void removeFrom(Coin c){
	amount=amount - c.value;
    }


}
