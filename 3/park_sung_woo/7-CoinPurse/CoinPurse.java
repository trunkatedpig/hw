public class CoinPurse{
    private int amount = 0;

    public void addTo(Coin c){
        amount = amount + c.getValue();
    }

    public void removeFrom(Coin c){
        amount = amount - c.getValue();
    }

    public int getAmount(){
        return amount;
    }
}
