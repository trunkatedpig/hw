public class CoinPurse {
    private int amount = 0;

    public CoinPurse() {}

    public CoinPurse(int amount) {this.amount = amount;}

    public CoinPurse(Coin c) {amount = c.getValue();}

//------------------------------------------------------------------------------

    public void addTo(int amount) {this.amount += amount;}

    public void addTo(Coin c) {amount += c.getValue();}

    public void removeFrom(int amount) {this.amount -= amount;}

    public void removeFrom(Coin c) {amount -= c.getValue();}

    public double getAmount() {return (double) amount / 100;}
}
